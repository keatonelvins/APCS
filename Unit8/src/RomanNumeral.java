//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++){
			while(num >= NUMBERS[i]){
				roman = roman + LETTERS[i];
				num -= NUMBERS[i];
			}
		}
		number = num;
	}

	public void setRoman(String rom)
	{
		number = 0; int temp = 0;
		while(rom.length() > 0){
			for(int i = 0; i < LETTERS.length; i++){
				temp = rom.indexOf(LETTERS[i]);
				number += NUMBERS[i];
			}
		}
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}