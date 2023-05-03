package MethodOverloading;

public class Ex1 {

	void getstudent(int Roll_no,String name)
	{
		System.out.println("Addmission Done");	
	}
	void getstudent(int Roll_no,String name,int Aadhar)
	{
		System.out.println("Addmission Done with Aadhar");	
	}
	
	public static void main(String[] args) {
		Ex1 a=new Ex1();
		a.getstudent(52, "Kapil");
		a.getstudent(52, "Kapil", 12313123);
	}
}

