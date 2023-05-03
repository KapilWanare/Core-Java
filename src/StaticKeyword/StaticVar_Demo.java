package StaticKeyword;

public class StaticVar_Demo{ 
	int a =10;
	static int b =10;
        public static void main(String[]args){ 
		StaticVar_Demo st= new StaticVar_Demo();     
		System.out.println(st.a); 
		System.out.println(st.b);
		StaticVar_Demo st1 = new StaticVar_Demo(); 
		int x = st1.a++;
		System.out.println(x); 
		int y = st1.b++; 
		System.out.println(y);
		StaticVar_Demo st2 = new StaticVar_Demo(); 
		int p = st2.a++;
		System.out.println(p); 
		int q = st2.b++; 
		System.out.println(q);
		StaticVar_Demo st3 = new StaticVar_Demo(); 
		int c = st3.a++;
		System.out.println(c); 
		int d = st3.b++; 
		System.out.println(d);
	}
}