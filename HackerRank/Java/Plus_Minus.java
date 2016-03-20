import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plus_Minus {
//https://www.hackerrank.com/challenges/plus-minus
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		double negative = 0;
		double positive = 0;
		double zeroes = 0;

		for(int i=0; i<n; i++){
            int temp = in.nextInt();

			if(temp < 0){ negative++; }
			else if(temp > 0){ positive++; }
			else{ zeroes++; }
		}

		System.out.printf("%.3f\n", (positive/n) );
		System.out.printf("%.3f\n", (negative/n));
		System.out.printf("%.3f\n", (zeroes/n));

	}
}
