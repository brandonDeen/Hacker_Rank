import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Game_Of_Thrones {
//https://www.hackerrank.com/challenges/game-of-thrones
    public static void main(String[] args) {

		run();

	}

	private static boolean isPalindrome(String s) {
		boolean result = true;

		int[] count = getCount(s);

		if(isEven(s)){
			for(int i=0; i<count.length; i++){
				if( !isEven(count[i]) )
					result = false;
			}
		}
		else{
			int singleChar = 0;
			for(int i=0; i<count.length; i++){
				if( !isEven(count[i]) )
					singleChar++;
			}
			if( !(singleChar == 1) )
				result = false;
		}

		return result;
	}

	private static int[] getCount(String s){
		int count[] = new int[26];
		final char[] ABC = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t','u','v','w','x','y','z'};

		for(int i=0; i<s.length(); i++){
			for(int j=0; j<ABC.length; j++){
				if(s.charAt(i) == ABC[j])
					count[j]++;
			}
		}

		return count;
	}

	private static boolean isEven(int i){
		boolean result = false;

		if( ( i % 2) == 0)
			result = true;

		return result;
	}

	private static boolean isEven(String s){
		boolean result = false;

		if( ( s.length() % 2) == 0)
			result = true;

		return result;
	}

	private static void run(){
		Scanner in = new Scanner(System.in);
		String s = in.next();

		if(isPalindrome(s))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
