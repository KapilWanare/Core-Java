package LogicalOpration;

public class Logic {
	public static void main(String[] args) {
		//&& Oprator

		System.out.println((5>3) && (8>5));// T
		System.out.println((5>3) && (8<5));// F

		// || Oprator

		System.out.println((5>3) || (8>5));// T
		System.out.println((5>3) && (8<5));// F
		System.out.println((5<3) && (8<5));// F

		// ! Oprator 

		System.out.println((5>3));// T
		System.out.println(!(5>3));// F

	}
}
