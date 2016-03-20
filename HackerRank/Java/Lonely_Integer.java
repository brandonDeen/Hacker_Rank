import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lonely_Integer {
  //https://www.hackerrank.com/challenges/lonely-integer
   public static void main(String[] args){
		findLonelyNumber();
	}

	private static void findLonelyNumber(){

		int[] vals = getInput();
		int lonely = -1;


		for(int i=0; i<vals.length; i++){
			boolean isLonely = true;
			for(int k=0; k<vals.length; k++){
				if((k != i) && (vals[k] == vals[i]) ){
					isLonely = false;
				}
			}

			if(isLonely){
				lonely = vals[i];
			}
		}
		System.out.println(lonely);
	}

	private static int[] getInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] vals = new int[n];

		for(int i=0; i<n; i++){
			vals[i] = in.nextInt();
		}

//		int[] vals = {0,0,1,2,1};

		return vals;
	}
}
