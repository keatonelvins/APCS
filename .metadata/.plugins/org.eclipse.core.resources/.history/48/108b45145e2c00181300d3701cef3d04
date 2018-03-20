package lab18e;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word18e implements Comparable<Word18e>
{
	private String word;

	public Word18e( String s)
	{
		word = new String(s);
	}

	public int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(char letter : word.toCharArray()){
			for(int i = 0; i < vowels.length(); i++){
				if(letter == vowels.charAt(i))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word18e rhs)
	{
		if(numVowels() > rhs.numVowels())
			return 1;
		if(numVowels() == rhs.numVowels())
			return 0;
		if(numVowels() < rhs.numVowels())
			return -1;
		return 0;
	}

	public String toString()
	{
		return word;
	}
}