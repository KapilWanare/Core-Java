package Interface;

public class InterfaceTest4 implements InterfaceEx4 
{
	public void method1() 
	{
		System.out.println("implemented method1");
	}
	public void method2() 
	{
		System.out.println("implemented method2");
	}
	public static void main(String arg[]) 
	{
		InterfaceEx4 obj = new InterfaceTest4();
		obj.method1();
	}
}
