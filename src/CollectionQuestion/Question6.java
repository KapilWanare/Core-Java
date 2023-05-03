package CollectionQuestion;

import java.util.HashMap;
import java.util.Map;
public class Question6{
	public static void main(String[] arguments) {

		Map<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");

		hash_map.forEach((key,value) -> System.out.println(key + " = " + value));
	}
}