import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Insertion_Sort_1 {
//https://www.hackerrank.com/challenges/insertionsort1    


   public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = in.nextInt();
		}
		insertionSort(arr);

	}

	private static void insertionSort(int[] a){
		int temp;

		for(int i=a.length-1; i>0; i--){
			int j = i;
			while( (j < a.length) && (a[j-1] > a[j]) ){
				//swap a[j-1] and a[j]
				temp = a[j];
				a[j] = a[j-1];
				print(a);
				a[j-1] = temp;
				j++;
			}
		}
        print(a);
	}

	private static void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print( a[i] + " ");
		}
		System.out.println();
	}

}
