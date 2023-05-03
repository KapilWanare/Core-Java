package Encapsulation;

public class EmployeeMain {
public static void main(String[] args) {
	Employee e= new Employee();
	e.setEmpid(1122);
	e.setEname("Kapil");
	e.setSalary(35000);
	//System.out.println(e.getEmpid());
	//System.out.println(e.getEname());
	//System.out.println(e.getSalary());
	
	e.getEmpid();
	e.getEname();
	e.getSalary();
}
}
