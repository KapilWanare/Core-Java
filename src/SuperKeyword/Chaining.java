package SuperKeyword;

public class Chaining {
	// default constructor of the class
	public Chaining() {
		System.out.println("Default constructor");
	}
	public Chaining(String str) {
		this();
		System.out.println("Parametrized constructor with single param");
	}
	public Chaining(String str, int num) {
		// It will call the constructor with String argument
		this("Hello");
		System.out.println("Parametrized constructor with double args");
	}
	public Chaining(int num1, int num2, int num3) {
		// It will call the constructor with (String, integer) arguments
		this("Hello", 2);
		System.out.println("Parametrized constructor with three args");
	}
	public static void main(String args[]) {
		// Creating an object using Constructor with 3 int arguments
		Chaining obj = new Chaining(5, 5, 15);
	}
}