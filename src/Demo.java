
public class Demo {

int x;
String s;
void show()
{
	int y=10;
	System.out.println(x);
	System.out.println(y);
}
void display()
{
	int y=5;
	System.out.println(y);
	System.out.println(s);
	
}
public static void main(String[] args) {

	Demo d= new Demo();
	d.show();
	System.out.println(d.x);
	d.display();
}
}
