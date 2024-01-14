package in.co.rays.exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientBalance {
		Account a=new Account();
		a.deposit(5000);
		a.withdrawl(6000);
	}
}
