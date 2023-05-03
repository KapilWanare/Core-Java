package Interface;

public class InterfaceTestEx2 implements InterfaceEx22 
{
	public void method1() 
	{
		System.out.println("Implemented method1");
	}
	public void method2() {

		System.out.println("Implemented method2");
	}
	public static void main(String[] args) {
		InterfaceTestEx2 t = new InterfaceTestEx2();
		t.method1();
		t.method1();
	}
}
