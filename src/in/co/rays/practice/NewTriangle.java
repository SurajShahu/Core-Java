package in.co.rays.practice;

public class NewTriangle extends NewShape {
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
		int tArea=(getBase()*getHeight())/2;
		System.out.println("triangle area =" + tArea);
	}
	

}
