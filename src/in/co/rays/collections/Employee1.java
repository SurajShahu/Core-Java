package in.co.rays.collections;

public class Employee1 implements Comparable<Employee1> {
	private int id;
	private String name;
	private int salary;

	public Employee1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee1)) {
			return false;
		}
		Employee1 e = (Employee1) obj;
		boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;
		return b;
	}

	@Override
	public int hashCode() {
		String str = this.id + this.name + this.salary;
		return str.hashCode();
	}

	@Override
	public int compareTo(Employee1 o) {
		// int i = this.name.compareTo(o.name);
		int i = Integer.toString(this.salary).compareTo(Integer.toString(o.salary));
		return i;
	}

}
