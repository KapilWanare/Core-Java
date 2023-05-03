package SerailizationProgram;

import java.io.FileInputStream; 
import java.io.ObjectInputStream; 
public class DeserializeStudent {
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\Kapil\\Desktop\\JBK\\g.txt"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject(); 
			Student s=(Student)o;
			System.out.println(s.name); 
			System.out.println(s.age);    
			System.out.println(s.location);
			ois.close();
		}
		catch(Exception e){ 
			e.printStackTrace();
		}
	}
}
