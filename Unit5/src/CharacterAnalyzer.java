//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('0');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper()
	{
		if(theChar >= 65 && theChar <= 90)
			return true;
		return false;
	}

	public boolean isLower( )
	{
		if(theChar >= 97 && theChar <= 122)
			return true;
		return false;
	}
	
	public boolean isNumber( )
	{
		if(theChar >= 48 && theChar <= 57)
			return true;
		return false;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{ 
		if(isNumber())
			return String.valueOf(getChar()) + " is a number. ASCII == " + String.valueOf(getASCII()) + "\n";
		else if(isLower())
			return String.valueOf(getChar()) + " is a lowercase character. ASCII == " + String.valueOf(getASCII()) + "\n";
		else if(isUpper())
			return String.valueOf(getChar()) + " is an uppercase character. ASCII == " + String.valueOf(getASCII()) + "\n";
		else
			return "Error";
	}
}