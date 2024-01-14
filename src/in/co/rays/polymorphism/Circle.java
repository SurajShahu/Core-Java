package in.co.rays.polymorphism;

public class Circle extends Shape {
	private int radius;
	private static double pie = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = pie * radius * radius;
		System.out.println("Circle area= " + area);
	}
}
