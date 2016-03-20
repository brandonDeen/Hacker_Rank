import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cut_The_Sticks {
//https://www.hackerrank.com/challenges/cut-the-sticks
    public static void main(String[] args){
			run();
			//test();
		}

		private static void run(){
			Scanner in = new Scanner(System.in);

			int n = in.nextInt();
			int[] sticks = new int[n];

			for(int i=0; i<n; i++){
				sticks[i] = in.nextInt();
			}
			cut(sticks);

		}

		private static void test(){
			int[] test0 = {1, 13, 3, 8, 14, 9, 4, 4};
			System.out.println("Test1: 1, 13, 3, 8, 14, 9, 4, 4");
			cut(test0);

			System.out.println("Test2: 8 8 14 10 3 5 14 12");
			int[] test1 = {8, 8, 14, 10, 3, 5, 14, 12};
			cut(test1);
		}

		private static void cut(int[] sticks){
			Arrays.sort(sticks);
			int min = findMin(sticks);
			int count = sticks.length;
			int last = 0;

			while(count > 0){
                count = 0;
                min = findMin(sticks);
				//System.out.println("min: "+min);print(sticks); System.out.println();
				for(int i=0; i<sticks.length; i++){
					if(sticks[i] > 0)
						count++;
					sticks[i] = sticks[i] -  min;
				}
                if(count > 0 && count != last)
    				System.out.println(count);
                last = count;
			}
		}

		private static void print(int[] a){
			System.out.print("test: ");
			for(Integer x : a)
				if(x > 0)
					System.out.print(x + " ");
		}

		private static int findMin(int[] s){
			int min = 10000;

			for(int i=0; i<s.length; i++){
				if(min > s[i] && s[i] > 0){
					min = s[i];
				}
			}

			return min;
		}
}
