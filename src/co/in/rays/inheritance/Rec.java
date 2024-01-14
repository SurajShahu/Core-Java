package co.in.rays.inheritance;

public class Rec extends Shapes {
	private int length, width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public void area()
	{
		int area=length*width;
		System.out.println("Area of rectangle= "+area);
	}
}
