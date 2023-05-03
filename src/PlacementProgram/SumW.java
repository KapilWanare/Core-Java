package PlacementProgram;

public class SumW{

	public static int cal(int a,int n)
	{
		
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum +=(n*i);
		}
		return sum/a;
		}
	
	public static void main(String[] args) {
		int a=2,n=4;
		System.out.println(cal(a,n));
	}
}
