package FileAssignment;
import java.io.*;

public class Read 
{
	public static void main(String[] args) 
	{
		BufferedReader reader = null;
		try {
			String CurrentLine;
			File file = new File("d:\\newfile.txt");
			FileReader fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			while ((CurrentLine = reader.readLine()) != null) 
			{
				System.out.println(CurrentLine);
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (reader != null) 
				{
					reader.close();
				}
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
	}
}