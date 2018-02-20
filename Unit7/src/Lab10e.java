//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		System.out.println("Guessing Game - how many numbers?");
		response = (char) keyboard.nextInt();
		
		GuessingGame test = new GuessingGame(response);
		
		test.playGame();
		System.out.println(test.toString());
		
		while(response != 'n')
		{
			System.out.println("Do you want to play again?");
			response = keyboard.next().charAt(0);
			if(response == 'n') break;
			System.out.println("Guessing Game - how many numbers?");
			response = (char) keyboard.nextInt();
			test.setBound(response);
			test.playGame();
			System.out.println(test.toString());
		}





	}
}