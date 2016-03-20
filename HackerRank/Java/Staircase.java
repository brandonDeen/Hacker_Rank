import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {
//https://www.hackerrank.com/challenges/staircase
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int n = 6;
		int spaces = n-1;
		int steps = 1;

		for(int i=0; i<n; i++){
			for(int k=0; k<spaces; k++){
				System.out.print(" ");
			}
			for(int k=0; k<steps; k++){
				System.out.print("#");
			}
			System.out.println();
			spaces--;
			steps++;
		}
	}
}
