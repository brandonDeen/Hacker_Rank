import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny_String {
//https://www.hackerrank.com/challenges/funny-string
    public static void main(String[] args) {
        isFunnyString();
	}

	private static void isFunnyString(){
		String[] stringArray = getInput();

		for(String s : stringArray){
			boolean funny = true;
			String temp = new StringBuilder(s).reverse().toString();
			char[] a = s.toCharArray();
			char[] b = temp.toCharArray();

			for(int i=1; i<a.length; i++){
				int a1 = (int)a[i], a2 = (int)a[i-1];
				int b1 = (int)b[i], b2 = (int)b[i-1];

				int tempA = Math.abs(a1 - a2);
				int tempB = Math.abs(b1 - b2);

				if(tempA != tempB){
					funny = false;
					break;
				}
			}

			if(funny){ System.out.println("Funny"); }
			else	 { System.out.println("Not Funny"); }
		}
	}

	private static String[] getInput(){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] s = new String[t];

		for(int i=0; i<t; i++){
			s[i] = in.next();
		}

//		String[] s = {"acxz", "bcxz" };

		return s;
	}
}
