package ArraysProgram;

import java.util.Scanner;

public class Ex4{

	public static void main(String[] args) {
		int a[]=new int[20];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Even Number of Arryas is :");
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			sc.close();
		}
	}
} 