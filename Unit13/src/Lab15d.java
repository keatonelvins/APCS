//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit13\\Unit13-Assignments\\lab15d.dat"));
		int numLines = file.nextInt();
		file.nextLine();
		for(int i = 0; i < numLines; i++){
			String words = file.nextLine();
			FancyWords newWords = new FancyWords(words);
			out.print(newWords);
		}
	}
}