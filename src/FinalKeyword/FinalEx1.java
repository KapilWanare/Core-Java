package FinalKeyword;

public class FinalEx1 {
	FinalEx1() {
		System.out.println("This is a default constructer of FinalEx2"); 
	}	
	final int a = 100;

	final void show() {
		System.out.println (a);
	}
	void welcome() { 
		System.out.println("Welcome to java by kiran,Pune");
	}
//} 
//public class FinalEx1Test extends FinalEx1{
	 //void show(){
	    //compile time error because method cannot override
	  //     System.out.println(“This is method of FinalEx1Test");
	    //}
	public static void main(String[] args) { 
	  FinalEx1 finalEx1=new FinalEx1(); 
	  finalEx1.show();
	  }
	}