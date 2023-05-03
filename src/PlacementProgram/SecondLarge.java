package PlacementProgram;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,8,6};
		int size=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[size-2]);
	}

}
