package StringProgram;

import java.util.Scanner;

public class StringConcat {
	public static void main(String[] args) {
		String s1,s2,s3;
		System.out.println("Enter two string:");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		s3=s1.concat(s2);
		System.out.println(s3);

	}

}
