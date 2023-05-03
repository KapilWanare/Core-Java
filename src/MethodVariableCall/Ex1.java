package MethodVariableCall;

public class Ex1 {

	int a;

	float b;

	String str;

	public void operation1() {

		a = 10;

		b = 15.26f;

		str = "Java";
	}

	public void operation2() {

		a = 2540;

		b = 27.9f;

		str = "KAPIL";

	}
	public void display() {
		System.out.println("The Integer Value is :" + a);
		System.out.println("The Float Value is :" + b);
		System.out.println("The String Value is: " + str);
	}
}