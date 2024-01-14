package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections1 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(50);
		c1.add(100);
		c1.add("suraj");
		c1.add(250);
		c1.add("rohit");
		System.out.println("1.c1 values= " + c1);
		
		Collection c2 = new ArrayList();
		c2.add(5);
		c2.add(10);
		c2.add("sahu");
		c2.addAll(c1);
		System.out.println("2.c2 after adding c1 = " + c2);
		
		//c1.clear();
		System.out.println("3.c1 is empty " + c1.isEmpty());
		System.out.println("4.c1 " + c1);
		System.out.println("5." + c2.contains("sahu"));
		Collection c3 = new ArrayList();
		c3.add("suraj");
		c3.add(5);
		c3.add(10);
		c3.add("sahu");
		System.out.println("6." + c3.containsAll(c1));
		Iterator iterator = c3.iterator();
		while(iterator.hasNext())
		{
			System.out.print(""+iterator.next()+" ");
		}	
		//c3.remove(10);
		System.out.println("\n7.c3(duplicate of c1) element after removing " +c3);
		c2.removeAll(c1);
		System.out.println("8." +c2);
		System.out.println("9. size= "+c1.size());
	}
}
