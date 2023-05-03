package FileHanddling;
import java.io.*;

public class FileAppend {
	public static void main(String[] args) throws Exception{
		String  data="data Append";
		File file =new File("C:/Users/Kapil/Desktop/JBK/new.txt");
		FileWriter fr=new FileWriter(file,true);
		BufferedWriter br=new BufferedWriter(fr);
		br.write(data);
		br.close();
		fr.close();
		System.out.println("Conten Add to File");

	}
}
