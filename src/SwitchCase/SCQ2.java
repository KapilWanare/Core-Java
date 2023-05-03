package SwitchCase;

import java.util.Scanner;

public class SCQ2 {
	public static void main(String args[])
	{
		String Month;
		System.out.println("Enter any month(1 to 12)");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		switch (A)
		{
		case 1:
			Month = "Month Jan";
			break;
		case 2:
			Month = "Month Feb";
			break;
		case 3:
			Month = "Month March";
			break;
		case 4:
			Month = "Month April";
			break;
		case 5:
			Month = "Month May";
			break;
		case 6:
			Month = "Month Jun";
			break;
		case 7:
			Month = "Month Jul";
			break;
		case 8:
			Month = "Month Aug";
			break;
		case 9:
			Month = "Month Sep";
			break;
		case 10:
			Month = "Month Oct";
			break;
		case 11:
			Month = "Month Nov";
			break;
		case 12:
			Month = "Month Dec";
			break;

		default:
			Month = "Invalid Month";
		}
		System.out.println("The entered month is in the " + Month + ".");
	}
}


