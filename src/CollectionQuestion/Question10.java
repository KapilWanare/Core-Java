package CollectionQuestion;
import java.util.ArrayList;
public class Question10 {
	public static void main(String[] arg)
	{
		ArrayList<String> flower = new ArrayList<String>(5);
		flower.add("red-rose");
		flower.add("tulip");
		flower.add("sun-flower");
		flower.add("marie-gold");
		flower.add("orchid");
		System.out.println("Size of list: "	+ flower.size());
		System.out.println("Flower ArrayList = " + flower);
		System.out.println("Removing element at index = 2 ");
		flower.remove(2);
		System.out.println("After removing element");
		System.out.println("Size of list: "+ flower.size());
		System.out.println("Flower ArrayList = " + flower);
	}
}
