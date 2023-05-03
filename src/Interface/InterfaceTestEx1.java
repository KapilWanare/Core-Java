package Interface;

public class InterfaceTestEx1 implements Interface11, Interface22 
{
	public void myMethod() 
	{
		System.out.println(" Multiple inheritance example using interfaces");
	}
	public static void main(String[] args) 
	{
		InterfaceTestEx1 id = new InterfaceTestEx1();
		id.myMethod();
	}
}
