package CollectionAssignment;
import java.util.*;

public class ArrayList_Demo5 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		List<String> list = new ArrayList<>();
		list.add("Second");
		list.add("Random");
		System.out.println(" Does ArrayList contains all list elements?: " + arrl.containsAll(list));
		list.add("one");
		System.out.println("\n Does ArrayList contains all list elements?: " + arrl.containsAll(list));
	}
}
