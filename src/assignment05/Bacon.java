package assignment05;

public class Bacon extends PizzaTopping {
	public Bacon(Pizza p) {
		super(p);
	}

	@Override
	public double getCost() {
		return 0.40 + getOn().getCost();
	}
}
