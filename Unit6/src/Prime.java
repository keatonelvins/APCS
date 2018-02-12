//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import static java.lang.Math.sqrt;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(0);
	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		for(int i = 2; i < sqrt(number) + 1; i++){
			if( number % i == 0 && i < number)
				return false;
		}
		return true;
	}

	public String toString()
	{
		String output;
		
		if(isPrime())
			output = String.valueOf(number) + " is prime." ;
		else
			output = String.valueOf(number) + " is not prime." ;
		return output;
	}
}