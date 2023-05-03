package PlacementProgram;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n,n1=0,n2=1,n3;
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(" " +n1);
		System.out.print(" " +n2);
		for(int i=1;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
	}

}
