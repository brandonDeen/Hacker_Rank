import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_Clean_Stochastic {
  //https://www.hackerrank.com/challenges/botcleanr
static void nextMove(int r, int c, String [] grid){
		int botX = c;
		int botY = r;
		int dirtyX = findX('d', grid);
		int dirtyY = findY('d', grid);

//		while((marioX != peachX) && (marioY != peachY)){
			if(dirtyY > botY){
				System.out.println("DOWN");
				botY++;
			}
			else if(dirtyY < botY){
				System.out.println("UP");
				botY--;
			}
			else if(dirtyX > botX){
				System.out.println("RIGHT");
				botX++;
			}
			else if(dirtyX < botX){
				System.out.println("LEFT");
				botX--;
			}
            else if(dirtyX == botX && dirtyY == botY){
				System.out.println("CLEAN");
			}
//		}
	}

	private static int findX(char c, String[] grid){
		for(int k=0; k< grid.length; k++){
			for(int i=0; i<grid[k].length(); i++){
				if(grid[k].charAt(i) == c){
					return i;
				}
			}
		}

		return -1;
	}

	private static int findY(char c, String[] grid){

		for(int k=0; k< grid.length; k++){
			for(int i=0; i<grid[k].length(); i++){
				if(grid[k].charAt(i) == c){
					return k;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n,r,c;
	        n=5;
	        r = in.nextInt();
	        c = in.nextInt();
	        in.useDelimiter("\n");
	        String grid[] = new String[n];


	        for(int i = 0; i < n; i++) {
	            grid[i] = in.next();
	        }

//	        n=5; r=1; c=2;
//	        String[] test =
//	        	   {"-----",
//	        		"--b--",
//	        		"-----",
//	        		"-----",
//	        		"-d---"};
//	        nextMove(n,r,c,test);

	    nextMove(r,c,grid);
	    in.close();
	}
}
