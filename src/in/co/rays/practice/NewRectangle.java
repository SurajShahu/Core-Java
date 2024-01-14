package in.co.rays.practice;

public class NewRectangle extends NewShape {
	private int length;
	private int width;

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
		int rArea=getLength()*getWidth();
		System.out.println("Rectangle area = " + rArea);
	}


}
