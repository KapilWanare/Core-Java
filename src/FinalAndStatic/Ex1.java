package FinalAndStatic;

public class Ex1 {

	public static void copyVariables(String str1, String str2) {

		// copies argument 2 to arg1

		str2 = str1;

		System.out.println("First String arg is: " + str1);

		System.out.println("Second String arg is: " + str2);

	}
	public static void main(String[] args) {

		// this is first method to call static method
		Ex1.copyVariables("PQR", "DEF");

		// this is second method to call static method
		copyVariables("XYZ", "ABC");
	}
}
