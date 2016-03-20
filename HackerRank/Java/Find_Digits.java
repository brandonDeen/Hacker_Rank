import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_Digits {
//https://www.hackerrank.com/challenges/find-digits
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int t = in.nextInt();
//		int t=1;

		for(int i=0; i<t; i++){
			findDigits(in.nextInt());
//			findDigits(1012);
		}
	}

	private static void findDigits(int x){
		//convert x into int array for each digit
		String s = String.valueOf(x);
		char[] charArray = s.toCharArray();
		int result = 0;

		for(char c : charArray){
			int temp = Integer.parseInt(c + "");
			if(temp != 0 && x % temp == 0){
				result++;
			}
		}

		System.out.println(result);
	}
}
