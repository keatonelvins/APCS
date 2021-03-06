//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lab18d;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit12\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> words = new ArrayList<Word>(size);
		
		for(int i = 0; i < size; i++){
			words.add(new Word(file.next()));
		}
		
		sort(words);
	}
	
	public static void sort(ArrayList<Word> wordList)
	{
		int min = 0;
		while(wordList.size() > 0){
			min = 0;
			for(int i = 0; i < wordList.size(); i++){
				if(wordList.get(i).compareTo(wordList.get(min)) == -1)
					min = i;
			}
			out.println(wordList.get(min));
			wordList.remove(min);
		}
	}
}
