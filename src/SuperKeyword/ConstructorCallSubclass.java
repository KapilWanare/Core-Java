package SuperKeyword;

class ConstructorCallSubclass extends ConstructorCallParent {
	ConstructorCallSubclass() {
		/*
		 * Compile adds super() here at the first line of this constructor
		 * implicitly
		 */
		System.out.println("Constructor of Subclass");
	}
	ConstructorCallSubclass(int num) {
		/*
		 * Compile adds super() here at the first line of this constructor
		 * implicitly
		 */
		System.out.println("Constructor with arg");
	}
	void display() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		// Creating object using default constructor
		ConstructorCallSubclass obj = new ConstructorCallSubclass();
		// Calling sub class method
		obj.display();
		// Creating object 2 using arg constructor 
		ConstructorCallSubclass obj2 = new ConstructorCallSubclass(10);
		obj2.display();
	}
}