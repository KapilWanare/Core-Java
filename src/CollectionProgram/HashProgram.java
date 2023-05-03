package CollectionProgram;

import java.util.*;

public class HashProgram {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "ABC");
		map.put(101, "AB");
		map.put(102, "A");
		map.put(103, "BC");
		map.put(104, "BCA");
		System.out.println("Intial list of element: "+map);
		map.remove(100);
		System.out.println("Update list of element: "+map);
		map.replace(101, "Kapil");
		System.out.println("Update List:" +map);
	}

}
