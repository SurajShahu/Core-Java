package in.co.rays.polymorphism;

public class Triangle extends Shape {
	private int base, height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public void area() {
		double area = (base * height) / 2;
		System.out.println("Triangle = " + area);
	}
}
