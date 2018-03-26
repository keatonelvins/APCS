//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{

		AtCounter test = new AtCounter();

		test.countAts(0, 0);
		out.println("0 0 has " + test + "\n");
		test.resetAtCount();
		
		test.countAts(2, 5);
		out.println("2 5 has " + test + "\n");
		test.resetAtCount();
		
		test.countAts(5, 0);
		out.println("5 0 has " + test + "\n");
		test.resetAtCount();
		
		test.countAts(9, 9);
		out.println("9 9 has " + test + "\n");
		test.resetAtCount();
		
		test.countAts(3, 9);
		out.println("3 9 has " + test + "\n");
		test.resetAtCount();
	}
}