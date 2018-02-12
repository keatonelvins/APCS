//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "unknown";
	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		for (char letter : word.toCharArray()){
			if(letter == c)
				return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		int i = -1;
		i = word.indexOf(s, 0);
		if ( i > -1)
			return true;
		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}