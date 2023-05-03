package SwitchCase;

import java.util.Scanner;

public class Vowel {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter Character: ");
		char ch=sc.next().charAt(0);

		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a'|| ch=='e' ||ch=='i' ||ch=='o'||ch=='u')  
		{
			System.out.println(ch+" is a Vowel.");
		}
		else
		{
			System.out.println(ch+" is not a Vowel."); 

		}
		sc.close();
	}
}



