package in.co.rays.practice;

public class PracticeConstructor {

	private String name;
	private int rno;

	public void setName(String name){
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public PracticeConstructor() {
		System.out.println("Default constructor");
	}

	public PracticeConstructor(String name, int rno) {

		System.out.println("Parameters");
		this.name = name;
		this.rno = rno;
	}

	public static void main(String[] args) {
		PracticeConstructor pc = new PracticeConstructor();
		PracticeConstructor pc1 = new PracticeConstructor("suraj ", 12 );
		System.out.println("name "+pc1.name +"RollNo = "+pc1.rno);
		//System.out.println(pc1);
		pc.setName("suraj1");
		System.out.println(pc.getName());
	
	}
}
