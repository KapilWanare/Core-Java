package FinalAndStatic;

public class Ex4{

	int a;
	// initialized to zero
	// initialized to zero only when class is loaded
	// not for each object created.
	static int b;

	Ex4(){

		// Constructor incrementing static variable b
		b++;

	}
	public void showData() {

		System.out.println("Value of a = " + a);

		System.out.println("Value of b = " + b);

	}
}