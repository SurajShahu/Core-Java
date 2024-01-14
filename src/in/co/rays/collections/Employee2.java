package in.co.rays.collections;

public class Employee2 {
	private int empId;
	private String name;
	private int phone;
	
	public Employee2(int empId,String name,int phone)
	{
		this.empId=empId;
		this.name=name;
		this.phone=phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		
		return empId +" "+name+" "+phone+"";
	}
}
