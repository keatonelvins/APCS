//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String className;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		className="";
		studentList = new ArrayList<Student>();
	} 
	
	public Class(String name, int stuCount)
	{
		className = name;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return className;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i = 0; i < studentList.size(); i++)
			classAverage += getStudentAverage(i);
		classAverage /= studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i < studentList.size(); i++)
			if(studentList.get(i).getName().equals(stuName))
				return studentList.get(i).getAverage();
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName = "";
		for(int i = 0; i < studentList.size(); i++)
			if(studentList.get(i).getAverage() > high){
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}	
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String name = "";
		for(int i = 0; i < studentList.size(); i++)
			if(studentList.get(i).getAverage() < low){
				low = studentList.get(i).getAverage();
				name = studentList.get(i).getName();
			}	
		return name;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++)
			if(studentList.get(i).getLowGrade() < failingGrade)
				output += studentList.get(i).getName() + ", ";
		return output;
	}
	
	public void sortArrayList()
	{
		Collections.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(int i = 0; i < studentList.size(); i++)
			output += studentList.get(i).toString() + "\n";
		return output;
	}  	
	
	public String printClass()
	{
		String output=""+getClassName()+"\n";
		for(int i = 0; i < studentList.size(); i++)
			output += studentList.get(i).toString() + "\n";
		output += "\nFailure List = " + getFailureList(70);
		output += "\nHighest Average = " + getStudentWithHighestAverage();
		output += "\nLowest Average = " + getStudentWithLowestAverage();
		output += "\nClass Average = " + getClassAverage();
		return output;
	}
}