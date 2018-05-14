package lab06;

public class CheckingAccount extends BankAccount {
	private int withdrawLimit;
	private int withdrawCount = 0;

	public CheckingAccount(double bal, int limit) {
		super(bal);
		if (limit < 1) {
			throw new IllegalArgumentException("Limit can't be negative");
		}
		withdrawLimit = limit;
	}

	public int getWithdrawLimit() {
		return withdrawLimit;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + withdrawCount + "/" + withdrawLimit + ")";
	}

	@Override
	public double withdraw(double amount) {
		if (withdrawCount < withdrawLimit) {
			withdrawCount++;
			return super.withdraw(amount);
		}
		return 0;
	}

}
