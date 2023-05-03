package FileHanddling;

import java.io.*;

public class ConcatFile {
public static void main(String[] args) throws Exception {
	FileInputStream input1 =new FileInputStream("C:\\Users\\Kapil\\Desktop\\JBK/new.txt");
	FileInputStream input2 =new FileInputStream("C:\\Users\\Kapil\\Desktop\\JBK/new1.txt");
    SequenceInputStream inst=new SequenceInputStream(input1,input2);	
     int j;
     while((j=inst.read())!=-1)
     {
    	 System.out.print((char)j);
     }
     inst.close();
     input1.close();
     input2.close();
}
}
