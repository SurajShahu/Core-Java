package in.co.rays.polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(12, 12);
		s[1] = new Circle(2);
		s[2] = new Triangle(2, 3);
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}
