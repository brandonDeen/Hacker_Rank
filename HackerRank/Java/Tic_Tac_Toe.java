import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tic_Tac_Toe {
//https://www.hackerrank.com/challenges/tic-tac-toe

/* Complete the function below to print 2 integers separated by a single space which will be your next move */
    public static int[] nextMove(char player, char[][] board){
    	int[] result = new int[2];
    	char otherPlayer;
    	if(player=='X'){
    		otherPlayer = 'O';
    	}
    	else{
    		otherPlayer = 'X';
    	}

		//check if middle is open
		if(board[1][1] == '_'){
			//if middle is open go there
			result[0] = 1; result[1] = 1; return result;
		}

		//check if I have 2 in a row
		for(int i=0; i<3; i++){
			if( player == board[i][0] &&
				board[i][0] == board[i][1] &&
				board[i][2] == '_'){

				result[0] = i; result[1] = 2;
				return result;
			}
			else if(player == board[i][1] &&
			   board[i][1] == board[i][2] &&
			   board[i][0] == '_'){

				result[0] = i; result[1] = 0;
				return result;
			}
			else if(player== board[i][0] &&
			   board[i][0] == board[i][2] &&
			   board[i][1] == '_'){

				result[0] = i; result[1] = 1;
				return result;
			}
		}

		//check if I have 2 in a column
		for(int i=0; i<3; i++){
			if(player == board[0][i] &&
			   board[0][i] == board[1][i] &&
			   board[2][i] == '_'){

				result[0] = 2; result[1] = i;
				return result;
			}
			if(player == board[1][i] &&
			   board[1][i] == board[2][i] &&
			   board[0][i] == '_'){

				result[0] = 0; result[1] = i;
				return result;
			}
			if(player == board[i][0] &&
			   board[0][i] == board[2][i] &&
			   board[1][i] == '_'){

				result[0] = 1; result[1] = i;
				return result;
			}
		}

		//check if I have 2 forward diagonally
		if(player == board[0][0]
				&& board[0][0] == board[1][1]
				&& board[2][2] == '_'){
			result[0] = 2; result[1] = 2; return result;
		}
		if(player == board[0][0]
				&& board[0][0] == board[2][2]
				&& board[1][1] == '_'){
			result[0] = 1; result[1] = 1; return result;
		}
		if(player == board[1][0]
				&& board[1][1] == board[2][2]
				&& board[0][0] == '_'){
			result[0] = 0; result[1] = 0; return result;
		}

		//check if I have 2 backward diagonally
		if(player == board[1][1]
				&& board[0][2] == board[1][1]
				&& board[2][0] == '_'){
			result[0] = 2; result[1] = 0; return result;
		}
		if(player == board[1][1]
				&& board[2][0] == board[2][2]
				&& board[1][1] == '_'){
			result[0] = 1; result[1] = 1; return result;
		}
		if(player == board[0][0]
				&& board[2][0] == board[2][2]
				&& board[0][2] == '_'){
			result[0] = 0; result[1] = 2; return result;
		}

		//check if other player has 2 in a row
		for(int i=0; i<3; i++){
			if( otherPlayer == board[i][0] &&
				board[i][0] == board[i][1] &&
				board[i][2] == '_'){

				result[0] = i; result[1] = 2;
				return result;
			}
			if(otherPlayer == board[i][1] &&
			   board[i][1] == board[i][2] &&
			   board[i][0] == '_'){

				result[0] = i; result[1] = 0;
				return result;
			}
			if(otherPlayer == board[i][0] &&
			   board[i][0] == board[i][2] &&
			   board[i][1] == '_'){

				result[0] = i; result[1] = 1;
				return result;
			}
		}

		//check if other player has 2 in a column
		for(int i=0; i<3; i++){
			if(otherPlayer == board[0][i] &&
			   board[0][i] == board[1][i] &&
			   board[2][i] == '_'){

				result[0] = 2; result[1] = i;
				return result;
			}
			if(otherPlayer == board[1][i] &&
			   board[1][i] == board[2][i] &&
			   board[0][i] == '_'){

				result[0] = 0; result[1] = i;
				return result;
			}
			if(otherPlayer == board[0][i] &&
			   board[0][i] == board[2][i] &&
			   board[1][i] == '_'){

				result[0] = 1; result[1] = i;
				return result;
			}
		}

		//check if other player have 2 forward diagonally
		if(otherPlayer == board[0][0]
				&& board[0][0] == board[1][1]
				&& board[2][2] == '_'){
			result[0] = 2; result[1] = 2; return result;
		}
		if(otherPlayer == board[0][0]
				&& board[0][0] == board[2][2]
				&& board[1][1] == '_'){
			result[0] = 1; result[1] = 1; return result;
		}
		if(otherPlayer == board[1][1]
				&& board[1][1] == board[2][2]
				&& board[0][0] == '_'){
			result[0] = 0; result[1] = 0; return result;
		}

		//check if other player have 2 backward diagonally
		if(otherPlayer == board[1][1]
				&& board[0][2] == board[1][1]
				&& board[2][0] == '_'){
			result[0] = 2; result[1] = 0;
			return result;
		}
		if(otherPlayer == board[2][0]
				&& board[2][0] == board[0][2]
				&& board[1][1] == '_'){
			result[0] = 1; result[1] = 1;
			return result;
		}
		if(otherPlayer == board[2][0]
				&& board[2][0] == board[1][1]
				&& board[0][2] == '_'){
			result[0] = 0; result[1] = 2;
			return result;
		}

		//else find the first available place next to one my marks
		for(int i=0; i<2; i++){
			for(int k=0; k<2; k++){
				char temp = board[i][k];
				if(player == temp){
					if(board[i+1][k] == temp){
						result[0] = i+1; result[1] = k;
		    			return result;
					}
					else if(board[i][k+1] == temp){
						result[0] = i; result[1] = k+1;
		    			return result;
					}
					else if(board[i+1][k+1] == temp){
						result[0] = i+1; result[1] = k+1;
		    			return result;
					}
				}
			}
		}

	//else place the mark in the first available spot
	for(int i=0; i<3; i++){
		for(int k=0; k<3; k++){
			if('_' == board[i][k]){
				result[0] = i; result[1] = k;
    			return result;
			}
		}
	}


	return result;
}

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char player;
        char board[][] = new char[3][3];
//      String board[] = {"___","___","_XO"};

        //If player is X, I'm the first player.
        //If player is O, I'm the second player.
        player = in.next().charAt(0);

        //Read the board now. The board is a 3x3 array filled with X, O or _.
        for(int i = 0; i < 3; i++) {
            String temp = in.next();
            board[i][0] = temp.charAt(0);
            board[i][1] = temp.charAt(1);
            board[i][2] = temp.charAt(2);
        }

        int[] move = nextMove(player,board);
        System.out.println( move[0] + " " + move[1] );

        in.close();
    }
}
