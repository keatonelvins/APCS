//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test= new LoopStats(1, 5);
		
		System.out.println(test.toString());
		System.out.println("total :: " + test.getTotal());
		System.out.println("even count :: " + test.getEvenCount());
		System.out.println("odd count :: " + test.getOddCount() + "\n");
		
		test.setNums(2, 8);
		
		System.out.println(test.toString());
		System.out.println("total :: " + test.getTotal());
		System.out.println("even count :: " + test.getEvenCount());
		System.out.println("odd count :: " + test.getOddCount() + "\n");
		
		test.setNums(5, 15);
		
		System.out.println(test.toString());
		System.out.println("total :: " + test.getTotal());
		System.out.println("even count :: " + test.getEvenCount());
		System.out.println("odd count :: " + test.getOddCount() + "\n");
		
	}
}