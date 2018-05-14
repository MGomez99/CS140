package lab02;


class Car {

	private String carType;

	private double topSpeed;

	public Car(String aCarType, double aTopSpeed) {
		this.carType = aCarType;
		this.topSpeed = aTopSpeed;

	}

	String getCarType() {

		return this.carType;

	}

	double getTopSpeed() {


		return this.topSpeed;

	}
}
