package MultipleClasses;

import java.util.Scanner;

import Airthmetic.Opration;

public class Test{
	public static void main(String[] args) {

		Opration obj=new Opration();
		int x,y,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values :");
		x=sc.nextInt();
		y=sc.nextInt();
		
		Addition obj1=new Addition();
		System.out.println("Addition of number:"+obj1.add(x, y));
		obj1.add(x, y);
		Subtraction obj2=new Subtraction();
		System.out.println("Subtraction of number:"+obj2.sub(x,y));
		obj2.sub(x, y);
		Multiplication obj3=new Multiplication();
		System.out.println("Multiplication of number:"+obj3.mult(x, y));
		obj3.mult(x,y);
		Division obj4=new Division();
		System.out.println("Division of number:"+obj4.div(x, y));
		obj4.div(x,y);
		sc.close();
	}
}