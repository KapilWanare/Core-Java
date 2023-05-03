package SwitchCase;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a charater:");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("It is a Vowel:");
			break;
		default:
			System.out.println("It Is a Consonant:");
		}
		sc.close();
	}

}
