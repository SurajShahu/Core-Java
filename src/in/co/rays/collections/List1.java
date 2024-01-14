package in.co.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add("Rohit");
		a1.add("Sanjana");
		a1.add("Sanju baba");
		a1.add("Rishendra late comer");
		a1.add("Suraj");
		a1.add("bhavesh");
		a1.add(3, "Rays");
		System.out.println("List after adding elements " + a1);
		System.out.println("Get element of 3rd index is" + a1.get(3));
		a1.remove(3);
		System.out.println("List after removing 3rd element " + a1);
		a1.set(2, 300);
		System.out.println("List after updating 2nd element " + a1);
		// System.out.println(a1);
		System.out.println("Index of bhavesh is " + a1.indexOf("bhavesh"));
		System.out.println("Last Index of 300 =" + a1.lastIndexOf(300));
		System.out.println("Sublist from 2-5= " + a1.subList(2, 5));
	}
}
