package PlacementProgram;

public class SmallestArray {

	public static void main(String[] args) {
		
		int a[]= {5,6,9,8,9};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Smallest Number Of Array Is:" +" " +min);
	}

}
