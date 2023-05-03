package CollectionAssignment;
import java.util.*;
public class ArrayList_Demo4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Zero");
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(" Actual ArrayList:" + arrl);
		arrl.clear();
		// this function delete all items from arraylist
		System.out.println("\n After clear ArrayList:" + arrl);
	}
}	
