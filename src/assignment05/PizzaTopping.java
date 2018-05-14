package assignment05;

public abstract class PizzaTopping implements Pizza {
	private Pizza on;

	PizzaTopping(Pizza p) {
		on = p;
	}

	@Override
	public String getDescription() {
		String retVal = getClass().getSimpleName();
		if (on instanceof PizzaTopping) {
			retVal += ", " + on.getDescription();
		} else {
			retVal += " on " + on.getDescription();
		}
		return retVal;
	}

	public Pizza getOn() {
		return on;
	}

	public void setOn(Pizza on) {
		this.on = on;
	}

	@Override
	public int compareTo(Pizza p) {
		int retVal = -1;
		if (p instanceof PizzaTopping) {
			retVal = getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
		}
		return retVal;
	}
}
