package Ifcondition;

import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number :");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int i=1;

		while(i<=10)

		{
			System.out.println( n+ "X" +i+ "=" +n*i);
			i++;


		}
	}
}


