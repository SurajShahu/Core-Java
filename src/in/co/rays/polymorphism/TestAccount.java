package in.co.rays.polymorphism;

public class TestAccount {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account a1=new Account(10);
		Account a2=(Account) a1.clone();
		a2.balance=200;
		System.out.println("A1 value="+a1.balance);
		System.out.println("A2 value="+a2.balance);
	}
}
