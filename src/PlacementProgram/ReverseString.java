package PlacementProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Kapil";
		String rev="";
		char ch;
		s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}

}
