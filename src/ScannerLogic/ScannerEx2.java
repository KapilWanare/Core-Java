package ScannerLogic;

import java.util.Scanner;

public class ScannerEx2 
{
	public static void main(String[] args)
	{
		String input = "JavaByKiran 2021 Java classes ";
		Scanner s = new Scanner(input).useDelimiter("\\s");
		// Scanner class with delimiter. The \s represents whitespace.
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}
	
}