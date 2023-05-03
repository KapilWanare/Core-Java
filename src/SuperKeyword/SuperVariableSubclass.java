package SuperKeyword;

public class SuperVariableSubclass extends SuperVariableParent {
	int num = 110;
	void printNumber() {
		// Super.variable_name
		System.out.println(super.num);
	}
	public static void main(String args[]) {
		SuperVariableSubclass obj = new SuperVariableSubclass();
		obj.printNumber();
	}
}