package AccessModifiers;

public class Ex111 {

	public static void main(String[] args) {
		Ex1 aa = new Ex1();
		
		//aa.m1();// error private
		
		aa.m2();// error default outside of package
		aa.m3();// error protected only in subclass
		aa.m4();// public everywhere
	}
}
