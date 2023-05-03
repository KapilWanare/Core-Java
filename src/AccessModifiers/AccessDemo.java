package AccessModifiers;

public class AccessDemo 
{
	public int x = 56;
	public void showDemo() 
	{
		System.out.println("The Variable value is " + x);
	}
	public void testDemo() 
	{
		System.out.println("It cannot be accessed in another class");
	}
}
