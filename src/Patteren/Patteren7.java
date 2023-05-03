package Patteren;

import java.util.Scanner;

public class Patteren7 {
	public static void main(String[] args) {
		int i,n,j;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i==1||i==2||i==3||j==1||j==2||j==3)

					System.out.print("* ");

				else

					System.out.print("$ ");


			}
			System.out.println();	
		}
		sc.close();

	}

}
