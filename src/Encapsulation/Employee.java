package Encapsulation;

class Employee 
{
	private int empid;
	private String Ename;
	private int salary;
	public void getEmpid() 
	{     //return type integer
		System.out.println(empid);
	}
	public void getEname() 
	{  //return type String
		System.out.println( Ename);
	}
	public void getSalary() 
	{ //return type integer
		System.out.println(salary);
	}
	public void setEmpid(int empid)
	{

		this.empid = empid;
	}
	public void setEname(String ename)
	{
		Ename = ename;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
}
