package CollectionAssignment;
import java.util.*;

public class HashMap_Demo2 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "Java");
		hm.put("second", "By");
		hm.put("third", "Kiran");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) 
		{
			System.out.println("Value of " + key + " is: " + hm.get(key));
		}
	}
}
