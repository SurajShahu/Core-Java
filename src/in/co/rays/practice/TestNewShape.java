package in.co.rays.practice;

public class TestNewShape {
	public static void main(String[] args) {

		NewRectangle r = new NewRectangle();
		r.setLength(6);
		r.setColor("red");
		r.setWidth(7);
		r.area();

		NewTriangle t = new NewTriangle();
		t.setColor("yellow");
		t.setBase(8);
		t.setHeight(9);
		t.area();

		NewCircle c = new NewCircle();
		c.setColor("Green");
		c.setRadius(10);
		c.area();
	}

}
