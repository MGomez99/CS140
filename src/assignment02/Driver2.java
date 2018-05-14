package assignment02;

class Driver2 {
	public static void main(String[] args) {
		Bank myBank = new Bank();
		myBank.createTestAccounts();
		System.out.println("Amount of money this bank needs to pay: $" + myBank.computeInteresetPay(0.05));
	}
}
