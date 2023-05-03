package SwitchCase;

import java.util.Scanner;

public class Seasons { 

	public void month_Season(int month){

		if(month>0 && month<=12)
		{ 
			if(month>2 && month<=5)
			{
				System.out.println("Summer");
			} 
			else if(month>5 && month<=9)
			{
				System.out.println("Rainy");
			} 
			else if(month>9 && month<=11)
			{
				System.out.println("Winter");
			} 
		}
		else
		{
			System.out.println("Invalid month");
		} 
	} 
	public static void main(String [] args)
	{ 
		System.out.println("Enter a Number(1 To 12)");
		Scanner sc=new Scanner (System.in); 
		int month=sc.nextInt(); 
		Seasons s=new Seasons (); 
		s.month_Season(month); 
	} 
} 