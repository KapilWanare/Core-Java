package CollectionQuestion;

import java.util.*;  
public class Question9 {  
	public static void main(String[] args) {  
		List<String> list = Arrays.asList("A", "B", "C", "D");  
		System.out.println("List before Shuffle : "+list);  
		Collections.shuffle(list);  
		System.out.println("List after shuffle : "+list);  
	}  
}  