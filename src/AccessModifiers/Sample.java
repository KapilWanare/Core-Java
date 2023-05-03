package AccessModifiers;

public class Sample 
{
	public static void main(String args[]) 
	{
		A obj = new A();
		System.out.println(obj.data);// Compile Time Error
		System.out.println(obj.data1);// No error as its default in same package
		obj.msg();// Compile Time Error
	}
}