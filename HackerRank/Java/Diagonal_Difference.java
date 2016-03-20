import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference {
//https://www.hackerrank.com/challenges/diagonal-difference
    public static void main(String[] args) {
        getDiagonalDifference();

	}

	private static void getDiagonalDifference(){
		int[][] array = getInput();

		int totalSum = Math.abs(getForwardSum(array) - getBackwardSum(array));
		System.out.println( totalSum );


	}

	private static int getForwardSum(int[][] a){
		int sum = 0;

		for(int i=0; i<a.length; i++){
			sum += a[i][i];
		}

		return sum;
	}

	private static int getBackwardSum(int[][] a){
		int sum = 0;

		for(int i=0, k=a.length-1; i<a.length && k>=0; i++, k--){
			sum += a[i][k];
		}

		return sum;
	}

	private static int[][] getInput(){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[][] array = new int[n][n];

		for(int i=0; i<n; i++){
			for(int k=0; k<n; k++){
				array[i][k] = in.nextInt();
			}
		}

//		int[][] array = {{ 11,  2,  4},
//						 {  4,  5,  6},
//						 { 10,  8,-12}};

		return array;
	}
}
