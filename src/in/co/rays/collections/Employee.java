package in.co.rays.collections;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
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
		return (id+ " "+name+" "+salary);
	}

}
