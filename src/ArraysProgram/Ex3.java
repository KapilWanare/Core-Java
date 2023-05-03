package ArraysProgram;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter The no of Element");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("The element of array is:");
	for(int i=0;i<a.length;i++ )
	{
		System.out.println(a[i]);
	}
	
	}
	
}
