//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words = new ArrayList<Word>();
		String wordArray[] = wordList.split(" ");
		for(String wordInString : wordArray){
			words.add(new Word(wordInString));
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for(Word wordInList : words){
			if(wordInList.getLength() == size)
				count++;
		}
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		for(int i = 0; i < words.size(); i++){
			if(words.get(i).getLength() == size){
				words.remove(i);
				i--;
			}
		}
		return 0;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for(Word wordInList : words){
			if(wordInList.getNumVowels() == numVowels)
				count++;
		}
		return count;
	}
	
	public String toString()
	{
	   String output = "";
	   for(int i = 0; i < words.size(); i++)
		   output += " " + words.get(i).getWord();
	   return output;
	}
}