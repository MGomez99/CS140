package lab06;

public class SavingsAccount extends BankAccount {
	private double rate;

	public SavingsAccount(double bal, double rt) {
		super(bal);
		if (rt < 0) {
			throw new IllegalArgumentException("Rate can't be negative");
		}
		rate = rt;
	}

	public double getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return super.toString() + " @ " + rate + "%";
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount + amount * rate);
	}

}
