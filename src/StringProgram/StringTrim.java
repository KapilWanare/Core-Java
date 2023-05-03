package StringProgram;

import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		
		String s1;
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		System.out.println(s1.trim());
		sc.close();
	}

}
