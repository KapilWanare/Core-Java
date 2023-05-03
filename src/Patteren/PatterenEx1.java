package Patteren;

import java.util.Scanner;

public class PatterenEx1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		int a=64;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) (a+i) +" ");
			}
			System.out.println();
		}
		sc.close();

	}
}
