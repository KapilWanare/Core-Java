package PlacementProgram;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	int n=123,rev=0;
    
    for(int i=1;i<4;i++)
    {
    	rev=n % 10;
    	n=n / 10;
    	System.out.println("Revers Of Number Is :");
    	System.out.println(rev);
    }
	}

}
