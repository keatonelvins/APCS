//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = Math.min(a, b);
	    max = Math.min(max, c);
	    for(int n = max; n >= 2; n--)
	    {
	        if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
	            return n;
	        }
	    }
	    return 1;
	}

	public String toString()
	{
		String output="";
		for(int a = 1; a <= number; a++){
			for(int b = a + 1; b <= number; b++){
				for(int c = b + 1; c <= number; c++){
					if(Math.pow(a, 2)+ Math.pow(b, 2)== Math.pow(c, 2)){
						if((a%2==1 && b%2==0) || (a%2==0 && b%2==1)){
							if(c%2 == 1){
								if(greatestCommonFactor(a, b, c) == 1){
									output = output + a + " " + b + " " + c + "\n";
								}
							}
						}
		            }
		        }
			}
		}
		return output+"\n";
	}
}