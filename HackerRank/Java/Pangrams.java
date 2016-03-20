import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
//https://www.hackerrank.com/challenges/pangrams
    public static void main(String[] args) {
        isPangram();
	}

	private static void isPangram(){
		//check if s contains each letter of the alphabet
		//if yes then print pangram
		//else print not pangram

		boolean pangram = true;
		String s = getInput();
		char[] charArray = s.replaceAll("\\s+","").toLowerCase().toCharArray();
		ArrayList<Character> charList = new ArrayList<Character>(0);

		for(char c : charArray){
			if( !charList.contains(c) && c != ' '){
				charList.add(c);

			}
		}
		if(charList.size() != 26){
			pangram = false;
		}

		if(pangram){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}
	}

	private static String getInput(){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();

		return input;
	}
}
