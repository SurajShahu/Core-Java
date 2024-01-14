package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Employee2> emp = new ArrayList();
		emp.add(new Employee2(1, "Suraj", 9875));
		emp.add(new Employee2(5, "Bhavesh", 98223));
		emp.add(new Employee2(3, "Sanjana", 98123));
		emp.add(new Employee2(4, "Rishendra", 98224));
		emp.add(new Employee2(2, "Rohit", 98223));
		System.out.println("Normal list= "+emp);
		Collections.sort(emp, new OrderIdComparator());
		System.out.println("Sort by ID= "+emp);
		Collections.sort(emp, new OrderNameComparator());
		System.out.println("Sort by name= "+emp);
		Collections.sort(emp, new OrderPhoneComparator());
		System.out.println("Sort by Phone= "+emp);
	}
}
