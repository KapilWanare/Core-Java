package HierarchicalInheritance;

public class HierarchialEx 
{
	public static void main(String args[]) 
	{
		A obj1=new A();
		B obj2 = new B();
		C obj3 = new C();
		D obj4 = new D();
		// All classes can access the method of class A
		obj1.methodA();
		obj2.methodB();
		obj3.methodC();
		obj4.methodD();
	}
}