package assignment02;

class Driver1 {
	public static void main(String[] args) {
		Customer[] customers = {
				new Customer("Joe", 1.0), new Customer("Jack", 10.0),
				new Customer("Jane", 1000.0)};
		BankAccount1 accounts[] = new BankAccount1[customers.length];
		for (int i = 0; i < customers.length; i++) {
			accounts[i] = new BankAccount1(customers[i].getCustomerName(), customers[i].getBalance());
		}
		System.out.println("Average Bank Acc Balance: " + Question1.averageBankBalance(accounts));
		System.out.println("Lowest Account Balance: " + Question1.lowestBankBalance(accounts));
		System.out.println("Longest Name: " + Question1.longestName(accounts));
		System.out.println("Average Customer Balance: " + Question1.averageCustomerBalance(customers));
		System.out.print("Greatest Customer Balance: " + Question1.greatestCustomerBalance(customers));

	}

}

