package Super;

public class Employee extends Person {//sub class
	int age=29;
	Employee()
	{
		System.out.println("Constructor Of Sub class");
		
	}
void PrintStudent()
{
	System.out.println("Class Person"+super.age);
	System.out.println("Class Employee"+this.age);
	System.out.println("Class Method" +age);
}

}
