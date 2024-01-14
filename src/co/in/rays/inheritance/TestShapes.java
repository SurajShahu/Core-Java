package co.in.rays.inheritance;

public class TestShapes {
	public static void main(String[] args) {
		Shapes[] s=new Shapes[2];
		s[0]=new Rec();
		s[1]=new Cir();
		
		Rec r=(Rec) s[0];
		r.setLength(2);
		r.setWidth(5);
		
		Cir c=(Cir) s[1];
		c.setRadius(3);
		
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}
