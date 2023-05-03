package PlacementProgram;

public class DistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="KApil";
		int temp;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			temp=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i!=j)
				{
					temp=temp+1;
					break;
				}
			}
			if(temp==0)
				System.out.println("Unic Characters Are : " +s.charAt(i));

		}
	}


}
