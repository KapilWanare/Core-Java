package MethodOverride;

public class BindDynamic 
{
	protected String val;
	void display(String str) 
	{
		val = "Base Class Fuction ".concat(str);
		System.out.println(val);
	}
}