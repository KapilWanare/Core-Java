package MethodVariableCall;

public class DataType{
	int a = 15000;
	int b = -20000;
	void add() {
		int c = a + b;
		System.out.println("The int Value is : " + c);
	}
	public static void main(String[] args) {
		DataType obj = new DataType();
		obj.add();
	}
}