package PlacementProgram;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int r,temp,n=454,sum=0;
			temp=n;
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println("The Number Is Palindrome : ");
			}
			else
			{
				System.out.println("Number Is Not Palindrome :");
			}
	}

}
