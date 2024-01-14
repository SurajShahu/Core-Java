package in.co.rays.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("sanju baba");
	v.add("suraj");
	v.add("rishendra");
	Enumeration e=v.elements();
	v.add("100");
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
}
