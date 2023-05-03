package ArraysProgram;

import java.util.Arrays;

public class SortIntArray {

	public static void bubbleSort(int[] arr) {

		int j = 0;
		int tmp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			j++;
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					sorted = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] thisIsAnIntArray = { 5, 1, 100, 50, 75, 12, 89, 51, 11, 28, 99 }; bubbleSort(thisIsAnIntArray);
		System.out.println(Arrays.toString(thisIsAnIntArray));
	}
}