package SerailizationProgram;

import java.io.FileOutputStream; 
import java.io.ObjectOutputStream;
public class SerializeStudent {
	public static void main(String[] args) {
		Student s = new Student(); 
		s.name = "Kapil"; //initialization
		s.age = 25; 
		s.location = "Nagpur"; 
		try{ //file creation and variable definition
			FileOutputStream fos = new FileOutputStream ("C:\\Users\\Kapil\\Desktop\\JBK\\g.txt");//file creation
			ObjectOutputStream oos = new ObjectOutputStream(fos);// object creation
			oos.writeObject(s); //writes object s to the invoking stream
			oos.flush(); // it clears the buffer
			System.out.println("Serialization is done...");
			oos.close();
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
