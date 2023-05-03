package StringAssignment;

public class EqualsExample
{
	public static void main(String args[])
	{
		String s1="javabykiran";
		String s2="javabykiran";
		String s3="JAVABYKIRAN";
		String s4="python";
		System.out.println(s1.equals(s2));//true because content and case is same
		System.out.println(s1.equals(s3));//false because case is not same
		System.out.println(s1.equals(s4));//false because content is not same
	}
}