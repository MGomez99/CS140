package lab02;

class Race {

	public static void main(String[] args) {
		Car ferrari = new Car("Ferrari", 349);
		Car bugatti = new Car("Bugatti", 408.84);
		Car prius = new Car("Prius", 180);
		Car[] race = {ferrari, bugatti, prius};
		for (Car i : race) {
			System.out.println("Car Type: " + i.getCarType());
		}
		System.out.println("Expected Avg. Top Speed = 312.613\nCalculated Average Top Speed = " + averageTopSpeed(race));
		System.out.println("Expected Top Speed = 408.84\nCalculated Top Speed = " + fastestSpeed(race));


	}

	private static double averageTopSpeed(Car[] cars) {

		double averageSpeed = 0;
		int num_of_cars = 0;
		for (Car i : cars) {
			averageSpeed = averageSpeed + i.getTopSpeed();
			num_of_cars++;
		}
		averageSpeed = averageSpeed / num_of_cars;
		return averageSpeed;

	}

	private static double fastestSpeed(Car[] cars) {
		double topSpeed = 0;
		for (Car i : cars) {
			if (i.getTopSpeed() > topSpeed) {
				topSpeed = i.getTopSpeed();
			}
		}
		return topSpeed;
	}
}
