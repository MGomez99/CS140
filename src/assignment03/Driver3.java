package assignment03;


import java.util.Arrays;

class Driver3 {
	public static void main(String[] args) {
		//BANK ACC ARRAYS
		BankAccount1[] nullBA = null;
		BankAccount1[] emptyBA = new BankAccount1[0];
		BankAccount1[] nullMemBA = new BankAccount1[3];
		BankAccount1[] BA = {new BankAccount1("Jane", 100), null, new BankAccount1("Jack", 100)};

		//CUSTOMER ARRAYS
		Customer[] nullC = null;
		Customer[] emptyC = new Customer[0];
		Customer[] nullMemC = new Customer[3];
		Customer[] C = {new Customer("Jane", 100), null, new Customer("Jack", 100)};

		//2D arrays for testing respective methods
		BankAccount1[][] baArrays = {nullBA, emptyBA, nullMemBA, BA};
		Customer[][] cArrays = {nullC, emptyC, nullMemC, C};
		//TESTING
		System.out.println("Bank Acc Methods: ");
		for (BankAccount1[] array : baArrays) {
			System.out.println("\nCurrent array: " + Arrays.toString(array));
			if (Question3.averageBankBalance(array).isPresent()) {
				System.out.println("Average Bank Acc Balance: " + Question3.averageBankBalance(array).get());

			} else {
				System.out.println("The Input is Null, Empty, or an Array of Null Members");
			}

			if (Question3.lowestBankBalance(array).isPresent()) {
				System.out.println("Average Bank Acc Balance: " + Question3.lowestBankBalance(array).get());

			} else {
				System.out.println("The Input is Null, Empty, or an Array of Null Members");
			}

			if (Question3.longestName(array).isPresent()) {
				System.out.println("Average Bank Acc Balance: " + Question3.longestName(array).get());

			} else {
				System.out.println("The Input is Null, Empty, or an Array of Null Members");
			}
		}
		System.out.println("Customer Methods: ");
		for (Customer[] array : cArrays) {
			System.out.println("\nCurrent array: " + Arrays.toString(array));
			if (Question3.averageCustomerBalance(array).isPresent()) {
				System.out.println("Average Bank Acc Balance: " + Question3.averageCustomerBalance(array).get());

			} else {
				System.out.println("The Input is Null, Empty, or an Array of Null Members");
			}

			if (Question3.greatestCustomerBalance(array).isPresent()) {
				System.out.println("Average Bank Acc Balance: " + Question3.greatestCustomerBalance(array).get());

			} else {
				System.out.println("The Input is Null, Empty, or an Array of Null Members");
			}
		}
		System.out.println("\nDone!\n");
	}
}
