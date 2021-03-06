//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modfiers
	public void add(String  word)
	{
		int spot = list.size();
		if(Collections.binarySearch(list, word) < 0){
			for(String w : list){
				if(w.charAt(0) > word.charAt(0)){
					spot = Collections.binarySearch(list, w);
					break;
				}
			}
			list.add(spot, word);
		}
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		return list.toString();
	}
}