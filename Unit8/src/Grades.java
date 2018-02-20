//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private static double[] grades;
	
	//constructor
	public Grades()
	{
		double[] a = {0};
		setGrades(a);
	}
	
	public Grades(double[] x)
	{
		double[] a;
		a = x;
		setGrades(a);
	}

	//set method
	public static void setGrades(double a[])
	{
		grades = a;
	}


	private double getSum()
	{
		double sum = 0.0;
		for(int i = 0; i < grades.length; i++)
			sum = sum + grades[i];
		return sum;
	}

	public double getAverage()
	{
		double average = getSum() / (double) (grades.length);
		return average;
	}
	
	public void sortArray()
	{
		Arrays.sort(grades);
		double temp;
		for(int i = 0; i < grades.length / 2; i++)
		{
		    temp = grades[i];
		    grades[i] = grades[grades.length - i - 1];
		    grades[grades.length - i - 1] = temp;
		}
	}


	//toString method
	public String toString()
	{
		String output = "";
		sortArray();
		for(int i = 0; i < grades.length; i++){
			output = output + "grade " + i + " ::   " + grades[i] + "\n";
		}
		output = output + "\naverage = " + getAverage();
		return output;
	}


}