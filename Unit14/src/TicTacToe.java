//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int spot = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				mat[i][j] = game.charAt(spot);
				spot++;
			}
		}
	}

	public String getWinner()
	{
		for(int i = 0; i < 3; i++){
			if(mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]){
				return String.valueOf(mat[i][0]) + " wins horizontally!";
			}
			else if(mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]){
				return String.valueOf(mat[0][i]) + " wins vertically";
			}
		}
		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return String.valueOf(mat[0][0]) + " wins diagonally";
		else if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
			return String.valueOf(mat[0][2]) + " wins diagonally";
		return "Cat's game - no winner!";
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < mat.length; r++){
			for( int c = 0; c < mat[r].length; c++)
				output += String.valueOf(mat[r][c]) + " ";
			output += "\n";
		}
		return output + getWinner() + "\n\n\n";
	}
}

/*
MC:
evaluate 2d arrays with multi loop structure
know how to find length of rows and columns
evaluate recursive methods

FRQ: one of the labs
INTERFACES
similar to comparable, but not comparable
figure out how to implement the interface
*/