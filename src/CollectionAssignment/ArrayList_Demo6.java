package CollectionAssignment;
import java.util.*;

public class ArrayList_Demo6 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Delhi");
		arrl.add("Nagpur");
		System.out.println(" Actual ArrayList:" + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("\nCreated Array content:");
		for (String str : strArr) 
		{
			System.out.println(str);
		}
	}
}
