package lab18b;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setWeight(0);
		setHeight(0);
		setAge(0);
	}	
		
	//write an initialization constructor with an int parameter ht
	public Monster(int h){
		setWeight(0);
		setHeight(h);
		setAge(0);
	}	
	
	//write an initialization constructor with int parameters ht and wt
	public Monster(int h, int w){
		setWeight(w);
		setHeight(h);
		setAge(0);
	}	
	
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int h, int w, int a){
		setWeight(w);
		setHeight(h);
		setAge(a);
	}	
	
	//modifiers - write set methods for height, weight, and age
	public void setWeight(int w)
	{
		myWeight = w;
	}
	
	public void setHeight(int h)
	{
		myHeight = h;
	}
	
	public void setAge(int a)
	{
		myAge = a;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getWeight()
	{
		return myWeight;
	}
	
	public int getHeight()
	{
		return myHeight;
	}
	
	public int getAge()
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster rav = (Monster)obj;
		if(rav.getAge() == myAge && rav.getHeight() == myHeight && rav.getWeight() == myWeight)
			return true;
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(myHeight > rhs.getHeight())
			return 1;
		else if(myWeight > rhs.getHeight())
			return 1;
		else if(myAge > rhs.getAge())
			return 1;
		else if(equals(obj))
			return 0;
		return -1;
	}

	//write a toString() method
	public String toString(){
		String output = "" + myHeight + " " + myWeight + " " + myAge;
		return output;
	}
	
}