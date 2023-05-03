package MathcClass;

import java.util.Scanner;

public class MathEx1 {
	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter two Number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(Math.pow(a, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.multiplyExact(a, b));
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.signum(b));
		sc.close();
	}
}

