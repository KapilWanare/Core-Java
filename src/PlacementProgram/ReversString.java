package PlacementProgram;
import java.util.Scanner;
public class ReversString {
	public static String ReversString(String str)
	{
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		String ReversString= s.toString();

		String [] arr=ReversString.split("\\s+");
		String ans="";	
	for(int i=arr.length-1;i>=0;i--)
	{
	  ans+=arr[i];
	  ans+=" ";
	}
	return ans;
	}
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the Sring :");
	   String str=sc.nextLine();
	   System.out.println(ReversString(str));
	   sc.close();
	}
}
