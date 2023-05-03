package Abstraction;

public class AbstractTestEx3 
{
	public static void main(String args[]) 
	{
		AbstractSubclassEx3 obj = new AbstractSubclassEx3();
		obj.getName("Javabykiran");
		obj.getGender("rather not say");
		obj.getCity("Pune");
		obj.getCountry("India");
		obj.display();
	}
}