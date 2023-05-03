
public class Priem {
	public static void main(String[] args) {
		int ct=0,n=0,i=0,j=0;
		while(n<25)
		{
		j=1;
		ct=0;
		while(j<=i)
		{
			if(i%j==0)
			ct++;
			j++;
		}if(ct==2) {
			System.out.println(i);
			n++;
			}
		i++;
		}
		
	}

}
