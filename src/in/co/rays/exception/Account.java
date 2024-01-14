package in.co.rays.exception;

public class Account {
	private int balance;
	private String account_number;

	public Account() {

	}

	public Account(int balance, String account_number) {
		this.balance = balance;
		this.account_number = account_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public void deposit(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		System.out.println("After deposit " + getBalance());
	}

	public void withdrawl(int amount)  {

		if (amount > getBalance()) {
			try {
				throw new InsufficientBalance();
			} catch (InsufficientBalance e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		} else {
			int total = getBalance() - amount;
			setBalance(total);
			System.out.println("After withdrawl "+getBalance());
		}
	}

}
