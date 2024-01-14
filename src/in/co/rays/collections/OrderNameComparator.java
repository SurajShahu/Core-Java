package in.co.rays.collections;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 op1, Employee2 op2) {

		return op1.getName().compareTo(op2.getName());
	}

}
