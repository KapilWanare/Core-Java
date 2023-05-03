package Interface;

class Vehicle implements Moveable 
{
	public void move() 
	{
		System.out.println("Average speed is :" + AVGSPEED);
	}
	public static void main(String[] arg) 
	{
		Vehicle vc = new Vehicle();
		vc.move();
	}
}