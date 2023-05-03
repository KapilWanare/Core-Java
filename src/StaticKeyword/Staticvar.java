package StaticKeyword;

public class Staticvar 
{ 
	static int i=10;
	public static void main(String[] args)
	{ 
		Staticvar s =new Staticvar(); 
		System.out.println(s.i); //Not Recommended
		System.out.println(Staticvar.i); //Recommended
	}
} 