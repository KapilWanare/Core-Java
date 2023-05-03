package MethodVariableCall;

public class AddOpration {
	int add_int(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		AddOpration addOperation = new AddOpration();
		int z = addOperation.add_int(2, 4);
		System.out.println(z);
	}
}