package StringProgram;

import java.util.Scanner;

public class StringUpperAndLower {
public static void main(String[] args) {
	
	String s1,s2;
	System.out.println("Enter two string:");
	Scanner sc=new Scanner(System.in);
	s1=sc.next();
	s2=sc.next();
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
}
}
