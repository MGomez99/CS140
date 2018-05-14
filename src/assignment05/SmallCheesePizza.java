package assignment05;

public class SmallCheesePizza implements Pizza {
	@Override
	public String getDescription() {
		return "Small cheese pizza";
	}

	@Override
	public double getCost() {
		return 8.0;
	}

	@Override
	public int compareTo(Pizza o) {
		return 1;
	}


}
