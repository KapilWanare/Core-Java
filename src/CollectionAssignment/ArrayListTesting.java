package CollectionAssignment;
import java.util.*;

public class ArrayListTesting 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> alStu = new ArrayList<>();
		Student stu = new Student(12, "pune", new Phone(232, 4000));
		Student stu1 = new Student(12, "pune2", new Phone(232, 8000));
		Student stu2 = new Student(12, "pune3", new Phone(232, 14000));
		Student stu3 = new Student(12, "pune4", new Phone(232, 3000));
		alStu.add(stu);
		alStu.add(stu1);
		alStu.add(stu2);
		alStu.add(stu3);
		// Give me students having mobile with cost more than 5000
		for (Student student : alStu) 
		{
			Phone pp = student.phone;
			System.out.println(student.loc);
			System.out.println(student.age);
			System.out.println(pp.mobNumber);
			System.out.println(pp.cost);
		}
	}
}


