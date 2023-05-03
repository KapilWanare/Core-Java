package StaticKeyword;

public class StaticBlock {
	static int i=10;  //static variable 
	int b=20;	      //global variable
	void display(){	
		System.out.println("This is display method");
	}
	static void show(){  //static method       
		System.out.println("JAVA BY KIRAN classes Pune");
		//System.out.println(b);   //if we want access variable ‘b’,non-static method is needed
		//if there is a variable in the static method, JVM throws a compile time error
	}
	{
		display();
	}
	static{
		//  display();   //this is a compile time error, we cannot call non-static methods
		System.out.println(i); // no error
		// System.out.println(" "+b);  //this compile time error shows we cannot access non-static //variable in static block
	}
	public static void main(String[] args) { 
		StaticBlock s =new StaticBlock(); 
		s.display();
		s.show();
		StaticBlock s1 = null; 
		s1.show();
	} 
}