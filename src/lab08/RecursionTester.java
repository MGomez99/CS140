package lab08;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RecursionTester {
	@Test
	public void testFactorialBase1() {
		assertEquals(1, Recursion.factorial(1));
	}

	@Test
	public void testFactorialBase2() {
		assertEquals(1, Recursion.factorial(0));

	}

	@Test
	public void testFactorialNonBase() {
		assertEquals(120, Recursion.factorial(5));

	}

	@Test
	public void testSquareRootBase() {
		assertEquals(1, Recursion.squareRoot(1), 1e-6);
	}

	@Test
	public void testSquareRootNonBase() {
		assertEquals(4, Recursion.squareRoot(16), 1e-6);
	}

	@Test
	public void testSumArrayList() {
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(3);
		ints.add(10);
		assertEquals(14, Recursion.sum(ints));

	}

	@Test
	public void testSumArray() {
		int[] ints = {1, 3, 10};
		assertEquals(14, Recursion.sum(ints));

	}

	@Test
	public void testBinomCoff1() {
		assertEquals(15, Recursion.binomialCoefficient(6, 2));
	}

	@Test
	public void testBinomCoff2() {
		assertEquals(6, Recursion.binomialCoefficient(6, 5));

	}

}
