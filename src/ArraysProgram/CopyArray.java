package ArraysProgram;

public class CopyArray {

	public static void main(String[] args) {

		int array1[] = { 2, 3, 4, 5, 8, 9 }; int array2[] = new int[6];
		System.out.println("array:");
		System.out.print("[");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}
		System.out.print("]");
		System.out.println("\narray1:");
		System.out.print("[");
		for (int j = 0; j < array1.length; j++) {
			array2[j] = array1[j];
			System.out.print(" " + array2[j]);
		}
		System.out.print("]");

	}
}