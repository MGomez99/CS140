package lab07;

public abstract class Herbivore extends Animal {

	private String foliage;
	private int agressionLevel;

	Herbivore(String fol, int aggLevel) {
		foliage = fol;
		agressionLevel = aggLevel;

	}

	abstract void graze();

	@Override
	public String toString() {
		return "A herbivore only eats plants. It can additionally perform the action graze, and has a foliage it eats.";
	}

	public String getFoliage() {
		return foliage;
	}

	public int getAgressionLevel() {
		return agressionLevel;
	}
}
