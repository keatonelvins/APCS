//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		out.println("What is the name of this class? ");
		String className = keyboard.nextLine();
		
		out.println("How many students are in this class?");
		int numStudents = keyboard.nextInt();
		
		Class newClass = new Class(className, numStudents);
		
		for(int i = 1; i <= numStudents; i++){
			out.println("Enter the name of students " + i + " : ");
			String studentName = keyboard.next();
			keyboard.nextLine();
			out.println("Enter the grades for " + studentName + "\nUse the format x - grades ( 2 - 100 100) : ");
			String gradeList = keyboard.nextLine();
			
			newClass.addStudent(i-1, new Student(studentName, gradeList));
			out.print("\n\n");
		}
		
		System.out.println(newClass.printClass());
	}		
}