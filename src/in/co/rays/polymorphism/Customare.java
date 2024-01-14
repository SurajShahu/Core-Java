package in.co.rays.polymorphism;

public class Customare implements Cloneable {
	String name = null;
	Account acc = new Account();

	public Customare(String name, int bal) {
		this.name = name;
		this.acc.balance = bal;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customare c = (Customare) super.clone();
		c.acc = (Account) acc.clone();
		return c;
	}
}
