package SwitchCase;

import java.util.Scanner;

public class SCQ1 {
	public static void main(String args[])
	{
		String season;
		System.out.println("Enter any month(1 to 12)");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		switch (A)
		{
		case 6:
		case 7:
		case 8:
		case 9:
			season = "Rainy Season";
			break;
		case 10:
		case 11:
		case 12:
		case 1:
			season = "Winter Season";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			season = "Summer Season";
			break;
		default:
			season = "Invalid Month";
		}
		System.out.println("The entered month is in the " + season + ".");
	}
}