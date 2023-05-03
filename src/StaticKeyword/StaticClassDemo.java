package StaticKeyword;

class StaticClassDemo { 
	static class JBKway{  //start of inner class 
		static int a=10; 
		int b=20;
		void display(){
			System.out.println("This is local method");
		}
		static void show(){ 
			int c=63;
			System.out.println("This is static method");
			System.out.println("C="+c);
		}	
	}
	public static void main(String[]args) {
		JBKway a1 =null;
		//System.out.println(a1.b);//runtime error
		System.out.println(a1.a);
		 //a1.display(); //runtime error 
		a1.show();
		System.out.println(a1.a);
	}
}