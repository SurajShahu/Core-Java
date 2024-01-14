package in.co.rays.collections;

public class TestHashcode {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sanjay", 1000);
		Employee e2 = new Employee(1, "sanjay", 1000);
		Employee e3 = e1;
		System.out.println(e3.equals(e1));
		// Employee e2=new Employee(1,"sanju baba",2000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
