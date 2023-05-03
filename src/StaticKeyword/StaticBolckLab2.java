package StaticKeyword;

public class StaticBolckLab2 { 
	StaticBolckLab2()
	{
		System.out.println("This is constructor");
	}
	{
		System.out.println("This is Non static Block");
	}
	static
	{
		System.out.println("This is static Block");
	}
	public static void main(String[] args) { 
		StaticBolckLab2 s= new StaticBolckLab2(); 
		StaticBolckLab2 s1=new StaticBolckLab2();
	}  
}
