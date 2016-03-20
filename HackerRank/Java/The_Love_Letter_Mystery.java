import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/the-love-letter-mystery
public class The_Love_Letter_Mystery {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
        if(T > 10){ T = 10; }
		String[] strings = new String[10];

		for(int i=0; i<T; i++){
			strings[i] = in.next();
            if(strings[i].length() > 10000)//if length is > 10^4
                strings[i] = lowerStringLength(strings[i]);
		}

		for(int i=0; i<T; i++){
			System.out.println(convertString(strings[i]));
		}
    }

    private static boolean isEven(String s){
    	boolean result = false;

    	if( (s.length() % 2) == 0)
    		result = true;

    	return result;
    }

    private static int convertString(String s){
    	int change = 0;
    	int half = s.length() / 2;//if length = 4 then = 2/ if length = 5 then = 2
        int end = s.length() - 1;

		if( isEven(s) && s.length() > 2){
			for(int j=end, i=0; j>=half && i<half; j--, i++){//if length = 4/ i=2, j=1 to i=3, j=0
				char x = s.charAt(i);
				char y = s.charAt(j);
				int comparison = Character.compare(x, y);
				if(comparison < 0)
					change += Math.abs(comparison);
                else
                    change += comparison;
			}
		}
		else if( !isEven(s) && s.length() > 1){
			for(int i=0, j=end; i<half && j>half; i++, j--){//if length = 55, half = 27/ i=0 to i=26 / j=54 to j=28
				char x = s.charAt(i);
				char y = s.charAt(j);
				int comparison = Character.compare(x, y);
				if(comparison < 0)
					change += Math.abs(comparison);
                else
                    change += comparison;
			}
		}
		else if(s.length() == 2){
			char x = s.charAt(1);
			char y = s.charAt(0);
			int comparison = Character.compare(x, y);
			if(comparison < 0)
				change += Math.abs(comparison);
            else
                change += comparison;
		}
        else if(s.length() == 1){
            change = 0;
        }

        return change;
    }

    private static String lowerStringLength(String s){
        int length = 10000;
        char[] charArray = new char[length];
        for(int i=0; i<length; i++){
            charArray[i] = s.charAt(i);
        }

        return charArray.toString();
    }
}
