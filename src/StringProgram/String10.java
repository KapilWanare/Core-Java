package StringProgram;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) 
	{

		String s = null;

  System.out.println("Enter String ");

  Scanner sc=new Scanner(System.in);

  s=sc.next();

  int i,l;

  l=s.length();

  for(i=1;i<=l;i++)
  {
	 System.out.println(s.substring(0, i));
  }
  
	}

}
