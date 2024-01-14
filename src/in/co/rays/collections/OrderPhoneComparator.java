package in.co.rays.collections;

import java.util.Comparator;

public class OrderPhoneComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getPhone()-o2.getPhone();
	}

}
