package in.co.rays.banking;

public class TestBank {
	public static void main(String[] args) {
		Bank[] b=new Bank[3];
		b[0]=new AxisBank(7.0,"Axis Bank ");
		b[1]=new HdfcBank(8.0,"Hdfc Bank ");
		b[2]=new IciciBank(7.5,"Icici Bank ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].getName()+b[i].getInteretRate());
		}
	}
}
