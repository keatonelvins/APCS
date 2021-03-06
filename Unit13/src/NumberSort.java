//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0){
			number /= 10;
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int size = getNumDigits(number);
		int[] sorted = new int[size];
		for(int i = 0; i < size; i ++){
			sorted[i] = number % 10;
			number /= 10;
		}
		for(int i = 0; i < size-1; i ++){
			int min = i;
			for(int j = i+1; j < size; j++){
				if(sorted[j] < sorted[min]){
					min = j;
				}
			}
			if(min != i){
				int temp = sorted[min];
				sorted[min] = sorted[i];
				sorted[i] = temp;	
			}
		}
		return sorted;
	}
}