package CollectionAssignment;
import java.util.*;

public class ArrayList_Demo1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrl = new ArrayList<>();
		// adding elements to the end0
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Aurangabad");
		arrl.add("Nagpur");
		Iterator<String> itr = arrl.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}