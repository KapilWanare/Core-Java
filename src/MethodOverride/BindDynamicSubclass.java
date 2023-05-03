package MethodOverride;

class BindDynamicSubclass extends BindDynamic
{
	void display(String str)
	{
		if (val == null) 
		{
			str = "Derived Class Fuction ".concat(str);
			System.out.println(str);
		}
	}
}