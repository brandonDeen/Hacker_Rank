import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_Clean {
//  https://www.hackerrank.com/challenges/botclean
    static void nextMove(int r, int c, String [] grid){
		int botX = c;
		int botY = r;
		int dirtyX = findX('d', grid);
		int dirtyY = findY('d', grid);

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

	public static int[] findClosestDirtyCell(String[] grid, int[] currentPosition){
		int[] result = new int[2];
		int min = 1000;

		for(int k=0; k<5; k++){
			for(int i=0; i<5; i++){
				if(grid[k].charAt(i) == 'd'){
					int temp = Math.abs(currentPosition[0] - k)+Math.abs(currentPosition[1] - i);
					if(temp < min){
						min = temp;
					}
				}
			}
		}


		return result;
	}

	public static int countDirtyCells(String[] grid){
		int count = 0;

		for(String s : grid){
			for(int i=0; i<5; i++){
				if(s.charAt(i) == 'd'){
					count++;
				}
			}
		}


		return count;
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

	    nextMove(r,c,grid);
	    in.close();
	}
}
