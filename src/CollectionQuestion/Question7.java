package CollectionQuestion;

import java.util.*;   
public class Question7  
{   
	public static void main(String args[])   
	{   

		ArrayList<String> list = new ArrayList<String>();   

		list.add("Volkswagen");   

		list.add("Porsche");   

		list.add("Mercedes-Benz");   
		list.add("Audi");   

		list.add("BMW");  

		System.out.println("Before Sorting: "+ list);   

		Collections.sort(list);   

		System.out.println("After Sorting: "+ list);   
	}   
}  