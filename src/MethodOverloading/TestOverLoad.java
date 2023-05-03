package MethodOverloading;

public class TestOverLoad {
	public static void main(String[] args) {
		OverLoad ov = new OverLoad(); 
		ov.sum(10);  //int             
		ov.sum(10.5);     //double       
		ov.sum(10,20);     //int ,int
		ov.sum(10, 20.5);	    //int,double
		ov.sum(10.5,10);//double,int
		ov.sum(10.4,20.5); //double,double
		ov.sum("Addition");//String
		ov.sum("hello"," world");
		ov.sum(100);
	}
}


