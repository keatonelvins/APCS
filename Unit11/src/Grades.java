//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private ArrayList<Grade> gradeList;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String grades)
	{
		setGrades(grades);		
	}
	
	public void setGrades(String grades)
	{
		Scanner chopper = new Scanner(grades);
		int length = chopper.nextInt();
		gradeList = new ArrayList<Grade>(length);
		chopper.next();
		for(int i = 0; i < length; i ++){
			double newGrade = chopper.nextDouble();
			gradeList.add(i, new Grade(newGrade));
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		gradeList.add(spot, new Grade(grade));
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < gradeList.size(); i++)
			sum += gradeList.get(i).getNumericGrade();
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i = 0; i < gradeList.size(); i++)
			if(gradeList.get(i).getNumericGrade() < low)
				low = gradeList.get(i).getNumericGrade();
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i = 0; i < gradeList.size(); i++)
			if(gradeList.get(i).getNumericGrade() > high)
				high = gradeList.get(i).getNumericGrade();
		return high;
	}
	
	public int getNumGrades()
	{
		return gradeList.size();
	}
	
	public String toString()
	{
		String output = "";
		for(int i = 0; i < gradeList.size(); i++)
			output += gradeList.get(i).getNumericGrade() + " ";
		return output;
	}	
}