package co.in.rays.inheritance;

public class Cir extends Shapes {
	private int radius;
	private double pie=3.14;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area()
	{
		double area=pie*radius*radius;
		System.out.println("Area of circle= "+area);
	}
	
}
