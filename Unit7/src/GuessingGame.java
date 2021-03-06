//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int counter;
	private int secretNum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		double r = Math.random();
		secretNum = (int) (r * (upperBound) + 1);
		int guess = 0;
		counter = 0;
		while(counter < upperBound)
		{
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if(guess < 1 || guess > upperBound)
				System.out.println("Number out of range!");
			else
				counter++;
			if(guess == secretNum) break;
		}
		toString();
	}
	
	public void setBound(int b)
	{
		upperBound = b;
	}

	public String toString()
	{
		int percentWrong = (counter - 1)* 100/(upperBound);
		String output= "It took " + counter + " guesses to guess " + secretNum + ".\nYou guessed wrong " + percentWrong + " percent of the time.";
		return output;
	}
}