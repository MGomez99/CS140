package assignment05;

public class LargeCheesePizza implements Pizza {
	@Override
	public String getDescription() {
		return "Large cheese pizza";
	}

	@Override
	public double getCost() {
		return 14.0;
	}

	@Override
	public int compareTo(Pizza o) {
		return 1;
	}


}
