package co.in.rays.inheritance;

public class Tri extends Shapes {
	private int base, height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void area()
	{
		int area=(base*height)/2;
		System.out.println("Area of triangle= "+area);
	}
}
