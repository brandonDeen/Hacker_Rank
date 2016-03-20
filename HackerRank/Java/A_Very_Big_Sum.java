import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class A_Very_Big_Sum {
//https://www.hackerrank.com/challenges/a-very-big-sum
    public static void main(String[] args) {
        System.out.println( sumArray() );
    }

    private static long sumArray(){
        long[] a = getArray();
        long sum = 0;

        for(long i : a){
            sum += i; //System.out.println(sum);
        }

        return sum;
    }

    private static long[] getArray(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        return a;
    }
}
