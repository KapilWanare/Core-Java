package ThisKeyword;

public class D extends C { 
	int a=40;
	void m1(){ 
		int a=50;
		System.out.println("This is javabykiran class"); 
		System.out.println(a);      //prints 50 
		System.out.println(this.a); //class variable value 40 
		System.out.println(super.a); //JVM print 30 Immediate   //superclass
		B b =new B();
		System.out.println(b.a); //no other way as super.super is not allowed
		A a1=new A();
		System.out.println(a1.a);  //only way to run A class variable
	}
	public static void main(String[] args) { 
		D b=new D(); 
		b.m1();
	}
} //end D