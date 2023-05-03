package MethodOverloading;

public class OverLoad {
	void sum(int a) { 
		System.out.println(a + a);
	}
	void sum(double a) { 
		System.out.println(a + a);
	}
	void sum(double a, double b) { 
		System.out.println(a + b);
	}
	void sum(int a, int b) { 
		System.out.println(a + b);
	}
	void sum(int a, double b) { 
		System.out.println(a + b);
	}
	void sum(double a, int b) { 
		System.out.println(a + b);
	}
	void sum(String str) { 
		System.out.println(str+" is performed with different dataypes");
	}
	void sum(String str1, String str2) { 
		System.out.println(str1+str2);
	}
}