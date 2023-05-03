package Patteren;

public class Patteren10 {

	public static void main(String[] args) 
	{
		int k=65;
		for (int i=0; i<=24; i++)
		{
			if (i % 5==0)
				System.out.println();
			System.out.print((char) (i+k) + " ");

		}
		System.out.println("\n\n******************************");
		for (int i=0; i<=24; i++) 
		{
			if (i % 5==0)
				System.out.println();
			System.out.print((int) (i+k) + " ");

		}
	}
}
