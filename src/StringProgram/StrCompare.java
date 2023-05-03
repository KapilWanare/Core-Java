package StringProgram;

public class StrCompare {
	public static void main(String[] args) {
		String s1,s2,s3;
		s1="Hello";
		s2="hello";
		s3="hello";
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		
		char a='H';
		char b='h';
		int x=(int) a;
		System.out.println(x);
		int y=(int)b;
		System.out.println(y);
		System.out.println(x-y);
	}
}
