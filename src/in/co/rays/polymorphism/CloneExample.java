package in.co.rays.polymorphism;

class Clone1 {
	int x, y;
}

class Clone2
{
	Clone1 c1=new Clone1();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Clone2 c2=(Clone2) super.clone();
		//c2.c1=new Clone1();
		c2.c1.x=c1.x;
		c2.c1.y=c1.y;
		return c2;
	}
}


public class CloneExample {
	public static void main(String[] args) {
			Clone2 c3=new Clone2();
			
	}
}
