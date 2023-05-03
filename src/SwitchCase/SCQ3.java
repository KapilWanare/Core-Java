package SwitchCase;

import java.util.Scanner;

public class SCQ3 {

	public static void main(String args[])
	{
		String Day;
		System.out.println("Enter any Day(1 to 7)");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		switch (A)
		{
		case 1:
			Day = "Mon";
			break;
		case 2:
			Day = "Tue";
			break;
		case 3:
			Day = "Wed";
			break;
		case 4:
			Day = "Thu";
			break;
		case 5:
			Day = "Fri";
			break;
		case 6:
			Day = "Sat";
			break;
		case 7:
			Day = "Sun";
			break;
		default:
			Day = "Invalid Day";
		}
		System.out.println("The entered Day is in the " + Day +"Day.");
	}
}
