import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
	    Grades test = new Grades(getInput());
	    System.out.println(test.toString());
	    
	    test.setGrades(getInput());
	    System.out.println(test.toString());
	    
	    test.setGrades(getInput());
	    System.out.println(test.toString());
	}
	
	public static double[] getInput()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the grades, separated by a comma");
		String response = keyboard.next();
		String[] gradesArray = response.split(",");
		
		double[] gradebook = new double[gradesArray.length];
		double transform = 0;
	    for(int i = 0; i < gradesArray.length; i++){
	    	transform = Double.parseDouble(gradesArray[i]);
	    	gradebook[i] = transform;
	    }	
	    return gradebook;
	}
}