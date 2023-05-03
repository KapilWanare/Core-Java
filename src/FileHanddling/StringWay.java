package FileHanddling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class StringWay {
	public static void main(String[] args){
		try {
		String path1="C:\\Users\\Kapil\\Desktop\\JBK/new.txt";
		 String path2="C:\\Users\\Kapil\\Desktop\\JBK/new1.txt";
		 FileInputStream fin1 =new FileInputStream(path1);
			FileInputStream fin2 =new FileInputStream(path2);
		    SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		    int j;
		     while((j=sis.read())!=-1)
		     {
		    	 System.out.print((char)j);
		     }
		     sis.close();
		     fin1.close();
		     fin2.close();

	}
	catch(Exception e) {
			 e.printStackTrace();
			 
		 }


}
}