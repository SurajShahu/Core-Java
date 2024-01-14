package in.co.rays.practice;

public class RectangleDemo extends ShapeDemo {
public static void main(String[] args) {
	int area;
	RectangleDemo rd=new RectangleDemo();
	rd.setLength(5);
	rd.setWidth(10);
	area=rd.getLength()+rd.getWidth();
	System.out.println("Area="+area);
}
}
