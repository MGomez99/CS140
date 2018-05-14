package lab07;

public abstract class Carnivore extends Animal {
	private String prey;
	private int predatoryLevel;

	Carnivore(String p, int pLevel) {
		prey = p;
		predatoryLevel = pLevel;
	}

	abstract void prowl();

	@Override
	public String toString() {
		return "A carnivore only eats meat. It can additionally perform the action prowl, and has prey it eats";
	}

	public String getPrey() {
		return prey;
	}

	public int getPredatoryLevel() {
		return predatoryLevel;
	}
}
