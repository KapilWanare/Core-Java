package Constructor;

public class Lab5 {
	public static void main(String[] args){
		Student s1=new Student();	
		s1.show();   
		Student s2 = new Student(102, "kd,kiran@jbk.com",s1.show());
		Student s3 = new Student(103, "kiran,Kiran@jbk.com",s2.show(),8888809416L);
		s3.show();
		s1.Student();  //calling the normal method,not the constructor
	}
}