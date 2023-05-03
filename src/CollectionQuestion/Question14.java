package CollectionQuestion;
import java.util.*;
public class Question14 {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tree_map
		= new TreeMap<Integer, String>();
		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
		tree_map.put(25, "Welcomes");
		tree_map.put(30, "You");
		System.out.println("Initial Mappings are: "+ tree_map);
		System.out.println("The size of the map is "+ tree_map.size());
	}
}
