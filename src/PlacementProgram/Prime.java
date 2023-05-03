package PlacementProgram;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,temp=0;
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println("Given Number Is Prime Number :");
		}
		else {
			System.out.println("Given Number Is Prime Not A Number :");	

		}
		sc.close();
	}
}
