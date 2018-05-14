package assignment03;

import java.util.Arrays;

class Driver2 {
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

		//Bank Account Methods
		System.out.println("Testing Bank account Methods:");
		for (BankAccount1[] array : baArrays) {
			System.out.println("\nCurrent Array: " + Arrays.toString(array));
			try {
				System.out.println("avg Bank Bal: " + Question2.averageBankBalance(array));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Lowest Bank Bal: " + Question2.lowestBankBalance(array));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Longest Name: " + Question2.longestName(array));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		//Customer Methods
		System.out.println("\nTesting Customer Methods:");
		for (Customer[] array : cArrays) {
			System.out.println("\nCurrent Array: " + Arrays.toString(array));
			try {
				System.out.println("Avg Customer Bal: " + Question2.averageCustomerBalance(array));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Greatest Customer Bal: " + Question2.greatestCustomerBalance(array));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nDone!\n");
	}
}

