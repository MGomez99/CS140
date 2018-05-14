package assignment02;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount1 {
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	private String customername;

	public BankAccount1(String str) {
		this(str, 0);
	}

	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance the initial balance
	 */
	public BankAccount1(String str, double initialBalance) {
		balance = initialBalance;
		customername = str;
	}

	/**
	 * Deposits money into the bank account.
	 *
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * Withdraws money from the bank account.
	 *
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	public String toString() {
		return getCustomerName() + " has " + getBalance() + " dollars.";

	}

	/**
	 * Gets the current balance of the bank account.
	 *
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Gets the name of the customer.
	 *
	 * @return name of the customer
	 */
	public String getCustomerName() {
		return customername;
	}


}