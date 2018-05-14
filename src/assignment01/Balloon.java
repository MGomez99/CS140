package assignment01;

class Balloon {
	private double radius = 0.0;

	public void inflate(double amount) {
		radius += amount;

	}

	public void inflatePct(double amount) {
		radius += radius * amount / 100;
	}

	public double getVolume() {
		return 4 * Math.PI * radius * radius * radius / 3;
	}

	public void doubleVolume() {
		radius += Math.cbrt((6 * getVolume()) / (4 * Math.PI)) - radius; // INCREASES radius to a new value to double volume
	}
}
