package lab07;

public class Tiger extends Carnivore {
	private String name;

	public Tiger(String p, int pLevel, String nm) {
		super(p, pLevel);
		name = nm;

	}

	public String getName() {
		return name;
	}

	@Override
	public String kingdom() {
		return "Animalia";
	}

	@Override
	public String genus() {
		return "Panthera";
	}

	@Override
	public String species() {
		return "P.tigris (tiger)";
	}

	@Override
	public void speak() {
		System.out.println("Growl!");

	}

	@Override
	public void eat() {
		System.out.println(getAnimalName() + "the tiger eats " + getPrey());

	}

	@Override
	public void move() {
		System.out.println("Tigers move gracefully due to their powerful leg and shoulder muscles.");

	}

	@Override
	public void sleep() {
		System.out.println("Tigers like to sleep in rocky places, grassy areas, or inside caves.");

	}

	@Override
	void prowl() {
		System.out.println("The tiger pounces on an unsuspecting " + getPrey());

	}

	@Override
	public String toString() {
		return "Tigers are a predator of Asia, known for their stripes";
	}

	@Override
	String getAnimalName() {
		return "Tiger";
	}
}
