//� A+ Computer Science  -  www.apluscompsci.com
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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		this();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String symbol = file.next();
				if(symbol.equals("#"))
					out.print(getRandomNoun() + " ");
				else if(symbol.equals("&"))
					out.print(getRandomAdjective() + " ");
				else if(symbol.equals("@"))
					out.print(getRandomVerb() + " ");
				else
					out.print(symbol + " ");
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try{
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while(scan.hasNextLine()){
				nouns.add(scan.nextLine());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(scan.hasNextLine()){
				verbs.add(scan.nextLine());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(scan.hasNextLine()){
				adjectives.add(scan.nextLine());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getRandomVerb()
	{
		double r = Math.random();
		return verbs.get((int)(verbs.size() * r));
	}
	
	public String getRandomNoun()
	{
		double r = Math.random();
		return nouns.get((int)(nouns.size() * r));
	}
	
	public String getRandomAdjective()
	{
		double r = Math.random();
		return adjectives.get((int)(adjectives.size() * r));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}