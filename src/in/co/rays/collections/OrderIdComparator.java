package in.co.rays.collections;

import java.util.Comparator;

public class OrderIdComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		return e1.getEmpId()-e2.getEmpId();
	}
	
}
