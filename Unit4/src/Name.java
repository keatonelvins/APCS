//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		setName("unknown");
	}

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int spaceIndex = name.indexOf(" ");
		String firstName = name.substring(0, spaceIndex);
		return firstName;
	}

	public String getLast()
	{
		int spaceIndex = name.indexOf(" ");
		String lastName = name.substring(spaceIndex + 1, name.length());
		return lastName;
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}