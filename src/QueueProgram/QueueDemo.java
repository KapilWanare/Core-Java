package QueueProgram;
import java.util.*; 
public class QueueDemo { 
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("A");  
		queue.add("B");  
		queue.add("C");  
		queue.add("D"); //1 
		System.out.println("head:"+queue.element());  //2
		System.out.println("head:"+queue.peek()); //3 
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println(queue.size()); //4 
		queue.poll();   //5
		queue.add("X");  
		queue.add("Y");  
		queue.add("Z");  
		//queue.clear();//6
		System.out.println("final Size of queue is "+queue.size()); 
		queue.poll(); 
		queue.poll(); 
		queue.poll(); 
		System.out.println("after removing  elements:");  
		for(String s: queue)
		{
			System.out.println(s);  
		}  
		System.out.println("Size of queue after removing elements is "+queue.size());
	}  
} 
