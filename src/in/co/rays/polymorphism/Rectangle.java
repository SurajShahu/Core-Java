package in.co.rays.polymorphism;

public class Rectangle extends Shape {
	private int length, width;


	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		int area = length * width;
		System.out.println("Rectangle area = " + area);
	}
}
