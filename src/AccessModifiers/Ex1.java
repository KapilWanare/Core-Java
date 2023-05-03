package AccessModifiers;

public class Ex1
{
	private void m1() 
	{
		System.out.println("m1 - private");
	}
	void m2() {
		System.out.println("m2 - default");
	}
	protected void m3() {
		System.out.println("m3 - protected");
	}
	public void m4() {
		System.out.println("m4 - public");
	}
	public static void main(String[] args) {
		Ex1 aa = new Ex1();
		
		//aa.m1();
		
		aa.m2();
		aa.m3();
		aa.m4();
	}


}
