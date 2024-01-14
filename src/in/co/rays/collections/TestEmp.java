package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Suraj", 25000);
		Employee e2 = new Employee(2, "Rohit", 24000);
		Employee e3 = new Employee(3, "Bhavesh", 23000);
		Employee e4 = new Employee(4, "Rishendra", 22000);

		List l1 = new ArrayList();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);

		Iterator it = l1.iterator();
		while (it.hasNext()) {
			//Object obj=it.next();
			Employee e=(Employee) it.next();
			System.out.println(e);
		}

	}
}
