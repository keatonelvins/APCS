//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;

	public Maze()
	{
		maze = new int[0][0];
		exitFound = false;
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				maze[i][j] = Integer.valueOf(String.valueOf(line.charAt((i*size) + j)));
			}
		}
	}

	public void hasExitPath(int r, int c)
	{
		if(r < maze.length && r >= 0 && c >= 0 && c < maze.length && maze[r][c] == 1){
			if(c == maze.length - 1 ){
				exitFound = true;
			}
			else{
				int save = maze[r][c];
				maze[r][c] = 0;
				hasExitPath(r + 1,c);
				hasExitPath(r - 1,c);
				hasExitPath(r,c + 1);
				hasExitPath(r,c - 1);
				maze[r][c] = save;
			}
		}
	}

	public String toString()
	{
		
		String output="";
		for(int r = 0; r < maze.length; r++){
			for( int c = 0; c < maze[r].length; c++)
				output += String.valueOf(maze[r][c]) + " ";
			output += "\n";
		}
		if(exitFound == true)
			return output + "exit found\n";
		return output + "exit not found\n";
	}
}