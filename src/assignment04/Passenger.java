package assignment04;

class Passenger {
	private static int nextId = 0;
	private String destinationFloor;
	private int Id;

	public Passenger(String destFL, Elevator elev) {
		if (destFL == null) {
			throw new IllegalArgumentException("Cannot give null arguments");
		}
		int dest = elev.getFloorIndex(destFL);
		if (dest < 0) {
			dest = 0;
		}
		if (!(dest < elev.getNumFloors())) {
			dest = elev.getNumFloors() - 1;
		}
		destinationFloor = elev.getFloorName(dest);
		Id = ++nextId;
	}

	public String getDestinationFloor() {
		return destinationFloor;
	}

	public int getId() {
		return Id;
	}

	public String toString() {
		return "" + Id;
	}

}

