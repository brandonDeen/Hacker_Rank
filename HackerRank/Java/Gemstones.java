//package unsolved;
/*
 * John has discovered various rocks. Each rock is composed of various elements, and each element is represented
 * by a lowercase latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element
 * is called a 'gem-element' if it occurs at least once in each of the rocks.

		Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

		Input Format
		The first line consists of N, the number of rocks.
		Each of the next N lines contain rocks' composition. Each composition consists of lowercase letters of English alphabet.

		Output Format
		Print the number of gem-elements that are common in these rocks. If there are none, print 0.

		Constraints
		1 ≤ N ≤ 100
		Each composition consists of only small latin letters ('a'-'z').
		1 ≤ Length of each composition ≤ 100

		Sample Input

		3
		abcdde
		baccd
		eeabg
		Sample Output

		2
		Explanation
		Only "a", "b" are the two kind of gem-elements, since these are the only characters that occur in each of the rocks' composition.
 * */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

	public static void main(String[] args){

		runNormal();

		//runTest();

	}

	private static void runNormal(){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String[] gems = new String[n];

		for(int i =0; i<n; i++){
			gems[i] = in.next();
		}

		System.out.println( getGemCount(gems) );
	}

	 private static void runTest(){
	        String[] gemTest = {"abcdde","baccd","eeabgklasdlkfjalksfjkasflasjdfkljaskdfjlaksjdfkasdjfoasfasdfasdfasds"};
			System.out.println(getGemCount(gemTest));
	    }

	private static int getGemCount(String[] s){
		//count the number of characters that occur in each string in s[]
		int count = 0;
		int[] isGem = new int[26];

		for(int i=0; i<s.length; i++){//iterate through strings in s[]
			int[] checked = new int[26];
			for(int j=0; j<s[i].length(); j++){//iterate through each char in s[i]
				int index = s[i].charAt(j) - 'a';//gives the index of that character in array
				checked[index]++;

				if(isGem[index] <= i && checked[index] <= 1){ isGem[index]++; }
			}
		}
		count = countGems(isGem, s.length);

		return count;
	}

	private static void printCount(int[] a){
		for(int i=0; i<a.length; i++){
			char c = (char) ('a' + i);
			System.out.println(c + ": " + a[i]);
		}

	}


	private static int countGems(int[] gemCount, int n){
		int count = 0;
		for(int i=0; i<gemCount.length; i++){
			if(gemCount[i] == n){
				count++;
			}
		}
		//printCount(gemCount);

		return count;
	}

}
