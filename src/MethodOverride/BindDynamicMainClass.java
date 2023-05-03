package MethodOverride;

class BindDynamicMainClass
{
	public static void main(String args[]) 
	{
		BindDynamicSubclass obj = new BindDynamicSubclass();
		obj.display("Called");
	}
}