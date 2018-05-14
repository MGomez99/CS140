package assignment05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTester {
	private Pizza order = new MediumCheesePizza(); //10.0
	private Pizza order2 = new SmallCheesePizza(); //8.0

	@Test
	public void testMedPizza() {
		order = new Bacon(order); //0.40
		order = new Pineapple(order); //0.35

		assertEquals(10.75, order.getCost(), 1E-6);
	}

	@Test
	public void testSmallPizza() {
		order2 = new Pepperoni(order2); //0.30
		order2 = new Mushroom(order2); //0.25

		assertEquals(8.55, order2.getCost(), 1E-6);
	}
}
