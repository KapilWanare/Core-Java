package StringLogicalExamples;
import java.io.*;

public class StringEx2 
{
	public static void main(String args[]) throws Exception 
	{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String name = "";
		while (!name.equals("stop")) // this condition checks input is equals to
			// 'stop' or not
		{
			System.out.println("Enter Input: ");
			name = br.readLine();
			System.out.println("Input is: " + name);
		}
	}
}

