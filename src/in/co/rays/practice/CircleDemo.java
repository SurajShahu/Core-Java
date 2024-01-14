package in.co.rays.practice;

public class CircleDemo extends ShapeDemo {
public static void main(String[] args) {
	double area;
	CircleDemo cd=new CircleDemo();
	cd.setRadius(5);
	int r=cd.getRadius();
	area=3.14*(r*r);
	System.out.println("Area of circle is "+area);
}
}
