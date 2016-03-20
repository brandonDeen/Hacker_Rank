import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Unbounded_Knapsack {
//https://www.hackerrank.com/challenges/unbounded-knapsack
    public static void main(String[] args){

		run();

		//test();
	}

	private static int knapsack(int[] a, int sum){
		int[] sol, mySol;
		int myFinalSol = 0;

		sol = new int[a.length];
		mySol = new int[a.length];

		for(int i=0; i<a.length; i++){
			if( (sum % a[i]) == 0){
				return sum;
			}
			else if(sum == 0){
				return 0;
			}
		}

		for (int i = 0; i < a.length; i++ ){
	          if ( sum >= a[i] )
	             sol[i] = knapsack( a, sum-a[i] );
	          // Knapsack capacity reduced by w[i]
	          // because it has item i packed in
	          // it already
	          else
	             sol[i] = 0;        // Not enough space to  pack item i
	       }

	       for (int i = 0; i < a.length; i++ ){
	          if ( sum >= a[i] )
	             mySol[i] = sol[i] + a[i];   // Value is increased by v[i]
	                                         // because it has item i packed in
	                                         // it already
	          else
	             mySol[i] = 0;        // Not enough space to  pack item i
	       }

		myFinalSol = mySol[0];
	    for (int i = 1; i < a.length; i++ )
	    	if ( mySol[i] > myFinalSol )
	    		myFinalSol = mySol[i];

		return myFinalSol;
	}

	private static void run(){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for(int i=0; i<t; i++){

			int n = in.nextInt();

			int[] a = new int[n];

			int k = in.nextInt();

			for(int j=0; j<n; j++){
				a[j] = in.nextInt();
			}
			System.out.println( knapsack(a,k) );
		}
	}
}
