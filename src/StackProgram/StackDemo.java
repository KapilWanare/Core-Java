package StackProgram;
import java.util.*;  
public class StackDemo {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  //1
		stack.push("Garvit"); 
		stack.push("Shalaka");
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.push("Kiran");
		stack.push("rima");
		stack.pop();//2
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Elements of the stack :" +stack);
		boolean status=stack.empty();//3
		System.out.println("The current status of the stack :"+status);
		int x=stack.size();//4
		System.out.println("The size of the stack is :"+x);
		System.out.println("Elements of the stack :" +stack);
		int find=stack.search("Ayush");//5
		System.out.println("Location of Ayush in stack is :"+find);
		String top=stack.peek();//6
		System.out.println("Element at the top of the stack :"+top);
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
	}
}
