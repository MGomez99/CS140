package lab07;

import java.util.ArrayList;
import java.util.Comparator;


class AnimalComparator implements Comparator<Animal> {

	public static int staticCompare(Animal a, Animal b) {
		return new AnimalComparator().compare(a, b);
	}

	public static void staticSortAnimals(ArrayList<Animal> list) {
		new AnimalComparator().sortAnimals(list);
	}

	@Override
	public int compare(Animal a, Animal b) {
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
	}

	private void sortAnimals(ArrayList<Animal> list) {
		Animal temp;
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (compare(list.get(j), list.get(j - 1)) == -1) {
					temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
	}

}
