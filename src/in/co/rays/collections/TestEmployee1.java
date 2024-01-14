package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee1 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1, "ram", 1000);
		Employee1 e2 = new Employee1(2, "shyam", 5000);
		Employee1 e3 = new Employee1(3, "suraj", 2500);
		Employee1 e4 = new Employee1(3, "suraj", 2500);
		Employee1 e5 = new Employee1(5, "raju", 6000);
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println(e3.equals(e4));
		System.out.println(e5.hashCode());
		System.out.println(e4.hashCode());
		Collections.sort(list);
		Iterator<Employee1> it = list.iterator();
		while (it.hasNext()) {
			Employee1 e = (Employee1) it.next();
			System.out.println(e);
		}
	}
}
