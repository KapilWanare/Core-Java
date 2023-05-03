package SwitchCase;

import java.util.Scanner;

public class SCQ4{
	public static void main(String[] args) {
		int d;
		System.out.println("Enter Month Number:");
		Scanner sc =new Scanner(System.in);
		d=sc.nextInt();
		if(d==6||d==7||d==8||d==9)
		System.out.println("Rainy Season:");
		else if(d==10||d==11||d==12||d==1)
			System.out.println("Winter Season:");
		else if(d==2||d==3||d==4||d==5)
			System.out.println("SummerSeason ");
		else 
			System.out.println("Invalid Entry");
		sc.close();
	}

}
