package assignment03;


import java.util.Optional;

class Question3 {
	/**
	 * Finds the average bank balance for all the bank accounts in the
	 * given array.
	 * Assume accs is not null or empty an no account in accs is null.
	 *
	 * @param accs the array of BankAccount1 elements to examine
	 * @return the average of the balances of the accounts in accs Or returns Optional.empty() instead of an exception
	 */
	public static Optional<Double> averageBankBalance(BankAccount1[] accs) {
		double average = 0.0;
		int accounts = 0;
		Optional<Double> retVal = Optional.empty();
		if (accs == null) {
			return retVal;
		} else if (accs.length == 0) {
			return retVal;
		}
		int nulls = 0;
		for (BankAccount1 member : accs) {
			if (member == null) {
				nulls++;
			}
		}
		if (nulls == accs.length) {
			return retVal;
		}
		for (BankAccount1 account : accs) {
			if (account == null) {
				continue;
			}
			average += account.getBalance();
			accounts++;
		}
		average = average / accounts;
		retVal = Optional.of(average);
		return retVal;
	}

	/**
	 * Find the account in the array parameter that has the small
	 * the smallest balance and in the case of a tie, return the
	 * first such account.
	 * Assume accs is not null or empty an no account in accs is null.
	 *
	 * @param accs the array of BankAccount1 elements to examine
	 * @return the bank account in the array accs that has the
	 * smallest balance. If there is more than one, then return the
	 * first of them. Or returns Optional.empty() instead of an exception
	 */
	public static Optional<BankAccount1> lowestBankBalance(BankAccount1[] accs) {
		int count = 0;
		double smallest_bal = 0.0;
		Optional<BankAccount1> retVal = Optional.empty();
		if (accs == null) {
			return retVal;
		} else if (accs.length == 0) {
			return retVal;
		}
		int nulls = 0;
		for (BankAccount1 member : accs) {
			if (member == null) {
				nulls++;
			}
		}
		if (nulls == accs.length) {
			return retVal;
		}
		BankAccount1 lowest_account = null;
		for (BankAccount1 account : accs) {
			if (account == null) {
				continue;
			}
			if (count == 0) {
				smallest_bal = account.getBalance();
				lowest_account = account;
				count++; //set lowest account as the first
			} else if (account.getBalance() < smallest_bal) {
				smallest_bal = account.getBalance();
				lowest_account = account;
				count++; //check for lowest account
			}
		}
		retVal = Optional.of(lowest_account);
		return retVal;
	}


	/**
	 * In the array accs find the names of the customers and
	 * return the longest name. If at least two names have the same
	 * length, return the last one in the array of greatest length.
	 *
	 * @param accs the array of BankAccount1 elements to examine
	 * @return the longest name of all the customerNames in
	 * the customers in accs. If there is a tie for the length,
	 * return the LAST name. Or returns Optional.empty() instead of an exception
	 */
	public static Optional<String> longestName(BankAccount1[] accs) {
		String longest_name = "";
		Optional<String> retVal = Optional.empty();
		if (accs == null) {
			return retVal;
		} else if (accs.length == 0) {
			return retVal;
		}
		int nulls = 0;
		for (BankAccount1 member : accs) {
			if (member == null) {
				nulls++;
			}
		}
		if (nulls == accs.length) {
			return retVal;
		}
		for (BankAccount1 account : accs) {
			if (account == null) {
				continue;
			}
			if (account.getCustomerName().length() >= longest_name.length()) {
				longest_name = account.getCustomerName();
			}

		}
		retVal = Optional.of(longest_name);
		return retVal;

	}


	/**
	 * Finds the average bank balance for all the bank accounts of the
	 * Customers in the given array.
	 * Assume accs is not null or empty an no Customer in accs is null
	 * and no account in any Customer is null.
	 *
	 * @param accs the array of Customer elements to examine
	 * @return the average of the balances of the customer accounts of
	 * the customers in accs. Or returns Optional.empty() instead of an exception
	 */
	public static Optional<Double> averageCustomerBalance(Customer[] accs) {
		double average = 0.0;
		int accounts = 0;
		Optional<Double> retVal = Optional.empty();
		if (accs == null) {
			return retVal;
		} else if (accs.length == 0) {
			return retVal;
		}
		int nulls = 0;
		for (Customer member : accs) {
			if (member == null) {
				nulls++;
			}
		}
		if (nulls == accs.length) {
			return retVal;
		}
		for (Customer customer : accs) {
			if (customer == null) {
				continue;
			}
			average += customer.getBalance();
			accounts++;
		}
		average = average / accounts;
		retVal = Optional.of(average);
		return retVal;
	}


	/**
	 * Find the Customer in the array parameter that has the largest
	 * balance in their account field and in the case of a tie, return the
	 * LAST such account.
	 * Assume accs is not null or empty an no Customer in accs is null
	 * and no account in any Customer is null.
	 *
	 * @param accs the array of Customer elements to examine
	 * @return the Customer with the largest bank account in the array accs.
	 * If there is more than one, then return the last of them. Or returns Optional.empty() instead of exception
	 */
	public static Optional<Customer> greatestCustomerBalance(Customer[] accs) {
		double largest_bal = 0.0;
		Customer most_wealthy = null;
		Optional<Customer> retVal = Optional.empty();
		if (accs == null) {
			return retVal;
		} else if (accs.length == 0) {
			return retVal;
		}
		int nulls = 0;
		for (Customer member : accs) {
			if (member == null) {
				nulls++;
			}
		}
		if (nulls == accs.length) {
			return retVal;
		}
		for (Customer customer : accs) {
			if (customer == null) {
				continue;
			}
			if (customer.getBalance() > largest_bal) {
				largest_bal = customer.getBalance();
				most_wealthy = customer;
			}
		}
		retVal = Optional.of(most_wealthy);
		return retVal;
	}
}
