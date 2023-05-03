package Abstraction;

public class AbstractTestEx1 extends AbstractclassEx1 
{
	public void disp2() 
	{
		System.out.println("I'm overriding abstract method");
	}
	public static void main(String[] args) 
	{
		AbstractTestEx1 obj = new AbstractTestEx1();
		obj.disp2();
		obj.disp1();
	}
}