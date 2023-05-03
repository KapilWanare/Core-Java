package PlacementProgram;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		int n,rem=0,sum=0;
		System.out.println("Enter The Number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<5;i++)
		{
			rem=n%10;
			sum=n/10;
			sum=rem+sum;
		}
		System.out.println("Sum Of Digit Is:" +sum);
		sc.close();
	}

}
