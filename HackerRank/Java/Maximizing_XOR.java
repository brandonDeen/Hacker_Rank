import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Maximizing_XOR {
//https://www.hackerrank.com/challenges/maximizing-xor

    public static void main(String[] args){

		run();
		//int testL = 10;	int testR = 15; System.out.println("Test: L = " + testL + ", R = "+ testR + "\nSolution: " + maxXor(testL,testR));
	}

	private static void run(){
		Scanner in = new Scanner(System.in);

		int L = in.nextInt();
		int R = in.nextInt();
		System.out.println(maxXor(L,R));
	}

	private static int maxXor(int L, int R){
		int result = 0;

		for(int a=L; a<=R; a++){
			for(int b=L; b<=R; b++){
				if((a ^ b) > result)
					result = (a ^ b);
			}
		}


		return result;
	}
}
