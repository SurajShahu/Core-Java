package in.co.rays.polymorphism;

public class TestCustomare {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customare c1 = new Customare("suraj", 50);
		Customare c2 = (Customare) c1.clone();

		c2.name = "Rohit";
		c2.acc.balance = 1000;

		System.out.println("c1 name = " + c1.name);
		System.out.println("c1 balance = " + c1.acc.balance);

		System.out.println("c2 name = " + c2.name);
		System.out.println("c2 balance = " + c2.acc.balance);
	}
}
