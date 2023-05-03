package FileHanddling;
import java.io.*;

public class FileReader1 {
	public static void main(String[] args) throws Exception{
		int ch;
		FileReader fr=null;
		try {
			fr=new FileReader("C:/Users/Kapil/Desktop/JBK/new.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found :");
		}
		while((ch=fr.read())!=-1)
			System.out.print((char)ch);
		fr.close();
	}
}
