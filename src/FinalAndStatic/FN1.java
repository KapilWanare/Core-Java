package FinalAndStatic;

public class FN1{

	final int a = 10;

	final void JBK() {

		int i = 0;

		for (i = 0; i < 5; i++) {

			// compile time error final variable's value can'tbe change
			System.out.println("value of I+" + i);
		}
	}
	public static void main(String[] args) {
		FN1 finalEx = new FN1();
		finalEx.JBK();
	}
}