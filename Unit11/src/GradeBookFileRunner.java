//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCS\\Unit11\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		String className = file.nextLine();
		int classSize = file.nextInt();
		
		Class myClass = new Class(className, classSize);
		
		for(int i = 0; i < classSize; i++){
			String studentName = file.next();
			file.nextLine();
			String studentGrades = file.nextLine();
			myClass.addStudent(i, new Student(studentName, studentGrades));
		}
		
		System.out.println(myClass.printClass());
		
		myClass.sortArrayList();
		
		System.out.println("\n\n" + myClass.printClass());
	}		
}