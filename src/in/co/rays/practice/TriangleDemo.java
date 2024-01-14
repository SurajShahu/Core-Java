package in.co.rays.practice;

public class TriangleDemo extends ShapeDemo {
public static void main(String[] args) {
	TriangleDemo td=new TriangleDemo();
	td.setLength(6);
	td.setWidth(15);
	double area;
	area=(td.getLength()*td.getWidth()/2);
	System.out.println("Area of triangle is "+area);
}
}
