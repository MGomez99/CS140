package lab06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BankTester {
	private List<BankAccount> accounts;
	private List<Object> objects;
	//we can initialize some objects to be used in later tests
	//using the Before keyword ensures this method is called before
	//the test methods are called

	//Please note that this method is rerun before the start of each test,
	//which means the BankAccounts will have their numId's increased
	//each time the account is called.

	//we will fix this issue by adding an @After method, which is run
	//after each test ends
	@Before
	public void initialize() {
		accounts = new ArrayList<>();
		accounts.add(new BankAccount(1000));
		accounts.add(new CheckingAccount(900, 10));
		accounts.add(new SavingsAccount(900, .1));
		accounts.add(new BankAccount(800));
		accounts.add(new CheckingAccount(850, 20));
		accounts.add(new SavingsAccount(100, .05));

		objects = new ArrayList<>();
		objects.add(5);
		objects.add(0.5);
		objects.add("Hi");
		objects.add(new BankAccount(5.0));
		objects.add(new SavingsAccount(5.0, .1));
		objects.add(1);
		objects.add(new ArrayList<>(Arrays.asList(5, 3, 2, 1)));
		objects.add("C");
	}

	@After
	public void resetIdNum() {
		BankAccount.reset();
		accounts.clear();
	}


	//the @Test is necessary, without it the test will not be run
	//**Bank Acc
	@Test
	public void testBankAccDeposit() {
		BankAccount bacc = new BankAccount(700.00);
		bacc.deposit(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see
			//if the expected and actual value are close enough to equaling one another
			assertEquals(800.00, bacc.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it
		//and print the error message out, then throw the AssertionError
		//so that the test still fails.
		catch (AssertionError e) {
			System.out.println("BankAccount's deposit() method failed: " + e.getMessage());
			throw e;
		}
	}

	//Here
	@Test
	public void testBankAccWithdraw() {
		BankAccount bacc = new BankAccount(700.00);
		bacc.withdraw(10);
		try {
			assertEquals(690, bacc.getBalance(), 1e-6);
		} catch (AssertionError e) {
			System.out.println("BankAccount's withdraw method failed: " + e.getMessage());
		}
	}

	//**Checking Acc
	@Test
	public void testCheckingAccWithdraw() {
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for (int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see
			//if the expected and actual value are close enough to equaling one another
			assertEquals(700.00, checking.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it
		//and print the error message out, then throw the AssertionError
		//so that the test still fails.
		catch (AssertionError e) {
			System.out.println("CheckingAccount's withdraw() method failed: " + e.getMessage());
			throw e;
		}
	}

	@Test
	public void testCheckingAccGetWithdrawCount() {
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for (int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two integers, we don't need a third argument
			//since ints can be checked for equality
			assertEquals(3, checking.getWithdrawCount());
		}
		//here if there is an assertion error, we can catch it
		//and print the error message out, then throw the AssertionError
		//so that the test still fails.
		catch (AssertionError e) {
			System.out.println("CheckingAccount's getWithdrawCount() method failed: " + e.getMessage());
			System.out.println("Make sure you adjust the withdrawCount in your CheckingAccount's withdraw() method!");
			throw e;
		}
	}

	@Test
	//Here
	public void testCheckingAccGetWithdrawLimit() {
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		try {
			assertEquals(10, checking.getWithdrawLimit());
		} catch (AssertionError e) {
			System.out.println("CheckingAccount's getWithdrawLimit() method failed: " + e.getMessage());
			throw e;
		}
	}

	@Test
	//Here
	public void testSavingDeposit() {
		SavingsAccount savings = new SavingsAccount(1000.00, .1);

		try {
			savings.deposit(10.0);
			assertEquals(1011.0, savings.getBalance(), 1e-6);

		} catch (AssertionError e) {
			System.out.println("SavingAccount's Deposit() method failed: " + e.getMessage());
			throw e;
		}
	}

	@Test
	//Here
	public void testSavingsGetRate() {
		SavingsAccount savings = new SavingsAccount(1000.00, .1);

		try {
			assertEquals(.1, savings.getRate(), 1e-6);

		} catch (AssertionError e) {
			System.out.println("SavingAccount's getRate() method failed: " + e.getMessage());
			throw e;
		}
	}


	//TODO:  ******Test cases are in their respective sections i.e. //savings acc, //checkings acc, etc.
	//This isolates testing a single method or case to a single testing method. Otherwise,
	//if you try to do too much testing in one tester method, you could throw an error
	//for a test and never find the errors of the other tests you put in that method.


	@Test
	public void dynamicDispatchPrinting() {
		for (BankAccount acc : accounts) {
			System.out.println(acc);
		}
		for (BankAccount b : accounts) {
			if (b instanceof SavingsAccount) {
				System.out.println("SavingsAccount: ");
			} else if (b instanceof CheckingAccount) {
				System.out.println("CheckingAccount: ");
			}
			//note that we do this as an else block
			//since SavingsAccount and CheckingAccounts are also
			//considered to be instances of BankAccount
			//since they are subclasses of BankAccount.
			else {
				System.out.println("BankAccount: ");
			}
			System.out.println(b);
		}
		for (Object o : objects) {
			System.out.println(o);
		}
	}

	@Test
	public void someTest() {
		for (BankAccount b : accounts) {
			b.deposit(10);
		}
		try {
			assertEquals("Acct. #" + accounts.get(0).getIdNum() + " has $1010.0", accounts.get(0).toString());
			assertEquals("Acct. #" + accounts.get(1).getIdNum() + " has $910.0 (0/10)", accounts.get(1).toString());
			assertEquals("Acct. #" + accounts.get(2).getIdNum() + " has $911.0 @ 0.1%", accounts.get(2).toString());
			assertEquals("Acct. #" + accounts.get(3).getIdNum() + " has $810.0", accounts.get(3).toString());
			assertEquals("Acct. #" + accounts.get(4).getIdNum() + " has $860.0 (0/20)", accounts.get(4).toString());
			assertEquals("Acct. #" + accounts.get(5).getIdNum() + " has $110.5 @ 0.05%", accounts.get(5).toString());
		} catch (AssertionError e) {
			System.out.println("One of the toString() methods failed...");
			throw e;
		}
		for (int i = 0; i < 12; i++) {
			for (BankAccount b : accounts) {
				b.withdraw(5);
			}
			System.out.println(accounts.get(0).toString());
			System.out.println(accounts.get(1).toString());
			System.out.println(accounts.get(2).toString());
			System.out.println(accounts.get(3).toString());
			System.out.println(accounts.get(4).toString());
			System.out.println(accounts.get(5).toString());
		}
	}


}