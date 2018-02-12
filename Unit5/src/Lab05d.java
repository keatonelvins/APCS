//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a character :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);

		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		
		out.print("Enter a character :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
	}
}