import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Even_Tree {
//https://www.hackerrank.com/challenges/even-tree
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] tree = new int[n];
		int[] count = new int[n];
		Arrays.fill(count, 1);

		for(int i=0; i<m; i++){
			int c = in.nextInt();
			int p = in.nextInt();

			tree[c-1] = p;
			count[p-1] += count[c-1];

			int root = tree[p-1];
			while(root != 0){
				count[root-1] += count[c - 1];
				root = tree[root-1];
			}
		}

		int counter = -1;
		for(int i=0; i<count.length; i++){
			if(count[i] %2 == 0){
				counter++;
			}
		}
		System.out.println(counter);
	}
}
