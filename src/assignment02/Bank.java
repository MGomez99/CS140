package assignment02;

class Bank {
	private Customer[] customer = new Customer[2000];

	public void createTestAccounts() {
		for (int i = 0; i <= 1999; i++) {
			customer[i] = new Customer("Name", 100 + Math.random() * 10000);
		}
	}

	public double computeInteresetPay(double rate) {
		double amount = 0.0;
		for (Customer customer : customer) {
			if (customer.getBalance() <= 1000.00) {
				amount += (rate / 1200) * customer.getBalance();
			} else if (customer.getBalance() > 1000) {
				amount += (1.5 * rate / 1200) * customer.getBalance();
			}
		}
		return amount;
	}
}
