import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stock_Predictions {
  //https://www.hackerrank.com/challenges/stockprediction
  static double m;
	static int k;
	static int d;
	static ArrayList<Stock> stocks;
	final static String buy = "BUY";
	final static String sell = "SELL";

	private static void setData(Scanner in) {
		m = in.nextDouble();
		k = in.nextInt();
		d = in.nextInt();
		stocks = new ArrayList<>();

		for(int i=0; i<k; i++){
			String name = in.next();
			int owned = in.nextInt();
			double[] prices = new double[5];
			prices[0] = in.nextDouble();
			prices[1] = in.nextDouble();
			prices[2] = in.nextDouble();
			prices[3] = in.nextDouble();
			prices[4] = in.nextDouble();

			Stock temp = new Stock(name, owned, prices);
			stocks.add( temp );
		}
	}

	private static void printTransactions(){
		boolean noTransactions = true;

		for(Stock s : stocks){
			//if i should buy and i have enough money to buy
			if(shouldBuy(s) && m >= s.prices[4]){
				noTransactions = false;
				buy(s);
			}
			//if the i should sell and I have more than 2 shares
			else if(shouldSell(s)){
				noTransactions = false;
				sell(s);
			}
			else if (noTransactions){
				System.out.println("0");
			}
		}
	}

	private static void sell(Stock s) {
		int sellNum = s.owned/2;

		System.out.println(s.name + " " + sell + " " + sellNum);
	}

	private static void buy(Stock s) {
		int buyNum = 0;

		for(int i=0; i< (m/s.prices[4]); i++){
			buyNum = i;
		}

		System.out.println(s.name + " " + buy + " " + buyNum);
	}

	private static boolean shouldSell(Stock s) {
		boolean result = false;
		double[] tempPrice = s.prices;

		if(tempPrice[4] > tempPrice[3]){
			result = true;
		}

		return result;
	}

	private static boolean shouldBuy(Stock s) {
		boolean result = false;
		double[] tempPrice = s.prices;

		if(tempPrice[4] < tempPrice[3]){
			result = true;
		}

		return result;
	}

	public static class Stock{
		String name;
		int owned;
		double[] prices;

		public Stock(String n, int o, double[] p){
			this.name = n;
			this.owned = o;
			this.prices = p;
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		setData(in);
		printTransactions();

		in.close();
	}
}
