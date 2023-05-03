package FileHanddling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		try {
			File obj=new File("C:\\Users\\Kapil\\Desktop\\JBK/new.txt");
			if(obj.createNewFile())
			{
				System.out.println("New File is created !");
			}else
			{
				System.out.println("File already Exists:");

			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}