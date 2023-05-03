package FileAssignment;
import java.io.*;

class CreateDirectory 
{
	public static void main(String args[]) 
	{
		try
		{
			String one = "e:/jbk"; // one directory
			String many = "e:/hello/hi/say"; // multiple directories
			// Create one directory
			File file = new File(one);
			if (!file.exists()) 
			{
				if (file.mkdir()) 
				{
					System.out.println("Directory : " + one + " created");
				}
			}
			// Create multiple directories
			File files = new File(many);
			if (!files.exists()) 
			{
				if (files.mkdirs()) 
				{
					System.out.println("Directories : " + many + " created");
				}
			}
		} catch (Exception e) 
		{
			System.err.println("Error : " + e.getMessage());
		}
	}
}