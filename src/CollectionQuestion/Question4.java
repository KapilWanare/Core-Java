package CollectionQuestion;
import java.util.*;
import java.util.stream.*;
class Question4 {
	public static <T> List<T> convertArrayToList(T array[])
	{
		List<T> list = new ArrayList<>();
		for (T t : array) {
			list.add(t);
		}
		return list;
	}

	public static void main(String args[])
	{
		String array[] = { "ABC", "XYZ","HELLO" };
		System.out.println("Array: " + Arrays.toString(array));
		List<String>
		list = convertArrayToList(array);
		System.out.println("List: " + list);
	}
}

