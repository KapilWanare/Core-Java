package CollectionAssignment;
import java.util.*;

public class ArrayList_Demo3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(" Before Actual ArrayList:" + arrl);
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		arrl.addAll(list);
		System.out.println("\n After Copy ArrayList: " + arrl);
	}
}