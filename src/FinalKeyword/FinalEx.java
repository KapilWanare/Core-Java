package FinalKeyword;

public class  FinalEx {    //final class
	final int a=10;
	final int i=0;
	public void JBK()
	{
		//for(i=0;i<5;i++) { //compile time error
			//final variable's value can't be change     
			System.out.println("value of i="+i);
		}
	//}

	public static void main(String[] args) {
		FinalEx finalEx=new FinalEx(); 
		finalEx.JBK();
	}
} 