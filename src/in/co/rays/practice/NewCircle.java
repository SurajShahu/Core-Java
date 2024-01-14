package in.co.rays.practice;

public class NewCircle extends NewShape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		double cArea = 3.14 * getRadius() * getRadius();
		System.out.println("Circle area =" + cArea);
	}
}
