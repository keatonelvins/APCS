//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = "";
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i = 0; i < values.length; i++){
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String word = file.next();
				for(int j = 0; j < word.length(); j++){
					char letter = word.charAt(j);
					for(int i = 0; i < letters.size(); i++){
							if(letter == letters.get(i))
								count.set(i, count.get(i) + 1);
						}
				}
			}
				
		}
		catch(Exception e){
			out.println("Houston we have a problem!");
		}
	}

	public char mostFrequent()
	{
		int max = count.get(0);
		int spot = 0;
		for(int i = 1; i < letters.size(); i++){
			if(count.get(i) > max){
				max = count.get(i);
				spot = i;
			}
		}
		return letters.get(spot);
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		int spot = 0;
		for(int i = 1; i < letters.size(); i++){
			if(count.get(i) < min){
				min = count.get(i);
				spot = i;
			}
		}
		return letters.get(spot);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}