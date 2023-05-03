package SuperKeyword;

public class SuperMethodCallingSubclass extends SuperMethodCalling {
	void display() {
		System.out.println("Child class method");
	}
	void printMsg() {
		// This would call Overriding method
		display();
		// This would call Overridden method
		super.display();
	}
	public static void main(String args[]) {
		SuperMethodCallingSubclass obj = new SuperMethodCallingSubclass();
		obj.printMsg();
	}
}