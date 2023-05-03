import java.util.Scanner;

public class Even {
	public static void main(String[] args) {

		int a,b;

		System.out.println("Enter the Number A ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Eneter The Number B");
		b=sc.nextInt();

		if(a>b)
		{
			System.out.println("A is AN Greater Number ");

		}
		else 
		{
			System.out.println("B is an Greater Number ");
		}

	}
}
