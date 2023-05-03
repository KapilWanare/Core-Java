package Airthmetic;

import java.util.Scanner;

public class OprationMain {
	public static void main(String[] args) {

		Opration obj=new Opration();
		int x,y;
		Scanner sc = new Scanner(System.in);
		 obj.str("Hello World");
		System.out.println("Enter two integer values :");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int res1=obj.add(x,y);
		System.out.println("Addition of x and y:"+res1);

		float res2=obj.sub(x,y);
		System.out.println("Subtraction of x and y:"+res2);

		double res3=obj.mult(x,y);
		System.out.println("Multiplication of x and y:"+res3);
       
		int res4=obj.mod(x,y);
		System.out.println("Modular of x and y:"+res4);
		int res5=obj.div(x,y);
		System.out.println("Division of x and y:"+res5);
		sc.close();
	}
}