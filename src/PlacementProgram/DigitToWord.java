package PlacementProgram;
import java.util.Scanner;

public class DigitToWord {
	public static void main(String[] args) {
		String[] word= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",};
		int []	number=new int[100];
		int n;
		System.out.println("Enter The Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i<=n;i++)
		{
			number[i]=n%10;
			n=n/10;
		}
		for(int j=3;j>0;j--)
		{
			System.out.println(word[number[j]]+ " ");
		}
		sc.close();
	}
}
