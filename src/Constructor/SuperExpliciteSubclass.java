package Constructor;

public class SuperExpliciteSubclass extends SuperExpliciteParent {
	SuperExpliciteSubclass() {
		/*
		 * super() must be added to the first line of constructor otherwise it
		 * would throw compilation error: " Constructor call must be the first
		 * statement in a constructor".
		 */
		super();
		System.out.println("Constructor of Subclass");
	}
	void display() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		SuperExpliciteSubclass obj = new SuperExpliciteSubclass();
		obj.display();
	}
}