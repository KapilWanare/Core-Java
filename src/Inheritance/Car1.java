package Inheritance;

public class Car1 extends Vehicle1 
{
	int CC;
	int gears;
	String color;
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getCC() 
	{
		return CC;
	}
	public void setCC(int cC) 
	{
		CC = cC;
	}
	public int getGears() 
	{
		return gears;
	}
	public void setGears(int gears) 
	{
		this.gears = gears;
	}
}