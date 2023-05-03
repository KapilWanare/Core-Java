package VectorClass;
import java.util.*; 
public class VectorDemo {  
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		v.addElement("Shalaka");
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  //1
		v.addElement("Shalaka");//10 elements//2
		v.add("Garima");// 11th element
		System.out.println(v);
		Enumeration<String> en=v.elements();  
		while(en.hasMoreElements()){  
			System.out.println(en.nextElement());  
		}  
		System.out.println(v.capacity());//3
		System.out.println(v.contains("Shalaka"));//4
		System.out.println(v.indexOf("Shalaka"));//5
		System.out.println(v.firstElement());//6
		System.out.println(v.lastElement());//7
		System.out.println(v.get(3));//8
		System.out.println(v.removeElement("Amit"));//9
		System.out.println(v.remove(0));//10
		System.out.println(v.elementAt(3));//11
		System.out.println(v.capacity());
		v.removeAllElements();//12
		System.out.println("vector after removing element:"+v);
	}  }
/*Vector
Vector uses a dynamic array to store the data elements.
 It is similar to ArrayList. 
It is synchronized .
It contains many methods that are not the part of Collection framework.
 */
