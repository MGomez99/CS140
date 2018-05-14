package assignment01;

class Driver3 {
	public static void main(String[] args) {
		System.out.println("Creating Balloon...");
		Balloon myBalloon = new Balloon();
		System.out.println("Current Balloon Volume: " + myBalloon.getVolume() + " cubic centimeters\n");

		System.out.println("Increasing Balloon Radius By 1 Centimeter...");
		myBalloon.inflate(1);
		System.out.println("Current Balloon Volume: " + myBalloon.getVolume() + " cubic centimeters\n");

		System.out.println("Increasing Balloon Radius by 5%...");
		myBalloon.inflatePct(5);
		System.out.println("Current Balloon Volume: " + myBalloon.getVolume() + " cubic centimeters\n");

		System.out.println("Doubling Balloon Volume...");
		myBalloon.doubleVolume();
		System.out.println("Current Balloon Volume: " + myBalloon.getVolume() + " cubic centimeters\n");


	}
}
