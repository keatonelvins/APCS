//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit14\\Unit14-Assignments\\Lab21i.dat"));
		int size = file.nextInt();
		file.nextLine();
		String line = file.nextLine();
		line = line.replaceAll(" ","");
		Maze test = new Maze(size, line);
		test.hasExitPath(0, 0);
		out.println(test.toString());
		
		while(file.hasNextLine()){
			size = file.nextInt();
			file.nextLine();
			line = file.nextLine();
			line = line.replaceAll(" ","");
			test = new Maze(size, line);
			test.hasExitPath(0, 0);
			out.println(test.toString());
		}
	}
}