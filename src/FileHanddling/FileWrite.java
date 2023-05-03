package FileHanddling;
import java.io.*;
public class FileWrite {
	public static void main(String[] args) throws IOException
	{
		// Accept a string 
		String str = "\ncontents added to output file";
		// attach a file to FileWriter 
		FileWriter fw=new FileWriter("C:/Users/Kapil/Desktop/JBK/new.txt");
		// read character wise from string and write 
		// into FileWriter 
		for (int i = 9; i < str.length(); i++)
			fw.write(str.charAt(i));
		System.out.println("Writing successful");
		//close the file 
		fw.close();
	}
}
