package lab18e;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import lab18d.Word;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit12\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word18e> words = new ArrayList<Word18e>(size);
		
		for(int i = 0; i < size; i++){
			words.add(new Word18e(file.next()));
		}
		
		sort(words);
	}
	
	public static void sort(ArrayList<Word18e> wordList)
	{
		int min = 0;
		while(wordList.size() > 0){
			min = 0;
			for(int i = 0; i < wordList.size(); i++){
				if(wordList.get(i).numVowels() < wordList.get(min).numVowels())
					min = i;
			}
			out.println(wordList.get(min));
			wordList.remove(min);
		}
	}
}