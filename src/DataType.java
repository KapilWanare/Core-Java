import java.util.Scanner;

public class DataType {
	public static void main(String[] args) {

		int a;
		float b;
		char c;
		double d;
		boolean e;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Integer Number:");
		a=sc.nextInt();
		System.out.println("The Value Of A Is An Integer:"+a);

		System.out.println("Enter The Float Number:");
		b=sc.nextInt();
		System.out.println("The Value Of B Is An Float:"+b);

		System.out.println("Enter The Charater:");
		c=sc.next().charAt(0);
		System.out.println("The Value Of C Is An Charater:"+c);

		System.out.println("Enter The Double Number:");
		d=sc.nextDouble();
		System.out.println("The Value Of D Is An Double:"+d);

		System.out.println("Enter The Boolean Number:");
		e=sc.nextBoolean();
		System.out.println("The Value Of E Is An Boolean:"+e);
		sc.close();
	}

}
