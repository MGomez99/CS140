package lab07;

import java.util.Comparator;

abstract class Animal implements Actions, Classification {

	private static Comparator<Animal> animalComp = (a, b) -> {
		String aPrey = "";
		String bPrey = "";

		if (a instanceof Carnivore) aPrey = ((Carnivore) a).getPrey();
		if (b instanceof Carnivore) bPrey = ((Carnivore) b).getPrey();

		if (aPrey.length() == 0 && bPrey.length() == 0) {
			return ((Herbivore) a).getAgressionLevel() - ((Herbivore) b).getAgressionLevel();
		}

		//if Animal A is B's prey then A is considered less than B
		if (a.getAnimalName().equals(bPrey)) return -1;
		if (b.getAnimalName().equals(aPrey)) return 1;
		if (aPrey.length() != 0 && bPrey.length() != 0) {
			return ((Carnivore) a).getPredatoryLevel() - ((Carnivore) b).getPredatoryLevel();
		}
		return aPrey.length() - bPrey.length();

	};

	public static Comparator<Animal> getComp() {
		return animalComp;
	}

	@Override
	public String toString() {
		return "This is the higher level abstract animal class. It's subclasses will implement the interfaces.\n";
	}

	abstract String getAnimalName();

}
