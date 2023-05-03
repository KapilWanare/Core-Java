package MethodOverride;

public class Override 
{
	public static void main(String[] args) 
	{
		// method calling from sub class object
		DerivedClass der = new DerivedClass();
		der.method();
		// method calling from super class object
		Baseclass base = new Baseclass();
		base.method();
		Baseclass base1 = new DerivedClass();
		base1.method(); 
	}
}