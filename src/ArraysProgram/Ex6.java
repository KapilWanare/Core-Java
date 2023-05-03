package ArraysProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int x,y;
		System.out.println("*************************************");
		System.out.println("Enter The Size of Array A:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("Enter The Element OF Array A:");
		int a[]=new int[x];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("*************************************");
		System.out.println("Enter The Size of Array B:");
		y=sc.nextInt();
		System.out.println("Enter The Element OF Array B:");
		int b[]=new int[y];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("*************************************");
		int c[]=new int[a.length + b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+ " ");
		}
		System.out.println("**************************************");
		System.out.println("Elements Of Arrays 1 And Arrays 2 Are : ");
		System.out.println(Arrays.toString(c));
		sc.close();
	}
}