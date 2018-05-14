package assignment01;

class Customer {
	private String customername;
	private BankAccount account;

	public Customer(String cname) {
		customername = cname;
		account = new BankAccount();

	}

	public Customer(String cname, double bal) {
		customername = cname;
		account = new BankAccount(bal);

	}

	private String getCustomerName() {
		return customername;
	}

	public BankAccount getAccount() {
		return account;
	}

	private double getBalance() {
		return account.getBalance();
	}

	public void deposit(double amount) {
		account.deposit(amount);
	}

	public void withdraw(double amount) {
		account.withdraw(amount);
	}

	public String toString() {
		return getCustomerName() + " has " + getBalance() + " dollars.";
	}

	public boolean hasMoreFundsThan(Customer other) {
		return getBalance() > other.getBalance();
	}
}
