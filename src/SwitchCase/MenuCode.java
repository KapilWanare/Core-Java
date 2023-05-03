package SwitchCase;

import java.util.Scanner;

public class MenuCode {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st Num:");
	a=sc.nextInt();
	System.out.println("Enter the 2nd Num:");
	b=sc.nextInt();
	System.out.println("Select Operation :");
	System.out.println("Enter + for Addition :");
	System.out.println("Enter - for Subtraction :");
	System.out.println("Enter * for Multipliation :");
	System.out.println("Enter / for Devision :");
	System.out.println("Enter Your Operation :");
	char ch=sc.next().charAt(0);
	switch(ch)
	{
	case '+':
		System.out.println("Addition Of A And B is:"+(a+b));
		break;
	case '-':
		System.out.println("Subtraction Of A And B is:"+(a-b));
		break;
	case '*':
		System.out.println("Multiplication Of A And B is:"+(a*b));
		break;
	case '/':
		System.out.println("Division Of A And B is:"+(a/b));
		break;
		default:
			System.out.println("Invalid Entry");
	}
}
}
