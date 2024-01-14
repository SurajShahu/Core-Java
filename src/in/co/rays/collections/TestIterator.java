package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("sanju baba");
		c.add("sanjana");
		c.add("suraj");
		c.add("rishendra");
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			//Object o=it.next();
			System.out.println(it.next());
		}
	}
}
