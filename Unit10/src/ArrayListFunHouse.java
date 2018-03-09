//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */

	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int factor = number - 1;
		while(factor > 1){
			if(number % factor == 0){
				nums.add(factor);
			}
			factor --;
		}
		nums.add(1);
		return nums;
	}
}