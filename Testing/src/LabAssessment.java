
public class LabAssessment {

	public static void main(String[] args)
	{
		System.out.println(getSomeGoofyNumbers(3));
	}
	
	public static boolean isGoofy(int num)
	{
		int length = 0;
		int sum = 0;
		int digit = num;
		for(int i = 1; i < num; i *= 10){
			if( num % i < num)
				length++;
		}
		for(int i = length; i > 0; i --){
			digit = (num - (num % (int)Math.pow(10, i-1)))/(int)Math.pow(10, i);
			if(num % digit == 0)
				sum += digit;
			System.out.println(digit);
		}		
		if(sum % 2 == 1)
			return true;
		return false;
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int i = 1;
		int index = 0;
		int[] goofyArray = new int[count - 1];
		while(goofyArray[count - 1] == 0){
			if(isGoofy(i)){
				goofyArray[index] = i;
				index++;
			}
			i++;
		}
		return goofyArray;
	}
}
