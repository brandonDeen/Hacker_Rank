import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Halloween_Party {
//https://www.hackerrank.com/challenges/halloween-party
    public static void main(String[] args){
        //runTest();
		run();
	}

	private static void run(){
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for(int i=0; i<t; i++){
			int k = in.nextInt();
			System.out.println(numberOfCuts(k));
		}
	}

	private static long numberOfCuts(int k){
		long cuts = 0;
		long half = k/2;

		if( isEven(k) ){
			cuts = half*half;
		}
		else{
			cuts = half*(half+1);
		}

		return cuts;
	}

	private static boolean isEven(int x){ return (x % 2) == 0; }
}
