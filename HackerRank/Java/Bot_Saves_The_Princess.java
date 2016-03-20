import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_Saves_The_Princess {
  //https://www.hackerrank.com/challenges/saveprincess
  private static void getPath(String[] grid){
		int marioX = findX('m', grid);
		int marioY = findY('m', grid);
		int peachX = findX('p', grid);
		int peachY = findY('p', grid);

		while((marioX != peachX) && (marioY != peachY)){
			if(peachY > marioY){
				System.out.println("DOWN");
				marioY++;
			}
			if(peachY < marioY){
				System.out.println("UP");
				marioY--;
			}
			if(peachX > marioX){
				System.out.println("RIGHT");
				marioX++;
			}
			if(peachX < marioX){
				System.out.println("LEFT");
				marioX--;
			}
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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String grid[] = new String[n];
        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }
        getPath(grid);
        in.close();

//        String[] test = {"---","-m-","p--"};
//        getPath(test);

	}
}
