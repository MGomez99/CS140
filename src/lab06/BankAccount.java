package lab06;

class BankAccount {
	private static int numAccounts = 0;
	private double balance;
	private int idNum;

	public BankAccount(double bal) {
		if (bal < 0) {
			throw new IllegalArgumentException("Balance can't be negative");
		}
		balance = bal;
		idNum = numAccounts++;
	}

	static void reset() {
		numAccounts = 0;
	}

	public double getBalance() {
		return balance;
	}

	public int getIdNum() {
		return idNum;
	}

	@Override
	public String toString() {
		return "Acct. #" + idNum + " has $" + balance;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount can't be negative");
		}
		balance += amount;
	}

	public double withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount can't be negative");
		}

		if (amount > balance) {
			double retVal = balance;
			balance -= balance;

			return retVal;
		} else {
			double retVal = balance - amount;
			balance -= amount;

			return retVal;
		}
	}


}
