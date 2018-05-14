package assignment04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Elevator {
	private int currentFloor;
	private List<Passenger> occupants = new ArrayList<>();
	private List<Line> lines = new ArrayList<>();
	private int groundFloor;
	private Direction currentDir = Direction.UP;
	private int capacity;
	private int numFloors;

	public Elevator(int nf, int gf, int cap) {
		capacity = cap;
		numFloors = nf;
		groundFloor = gf;
		currentFloor = gf;
		for (int i = 0; i < numFloors; i++) {
			lines.add(null);
		}

	}

	public int getNumFloors() {
		return numFloors;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public List<Line> getLines() {
		return lines;
	}

	public Direction getCurrentDir() {
		return currentDir;
	}

	public int getNumOccupants() {
		return occupants.size();
	}

	public String getFloorName(int index) {
		if (index < 0 || index >= numFloors) {
			throw new IllegalArgumentException("Illegal floor number");
		}
		if (index == groundFloor) {
			return "G";
		} else if (index < groundFloor) {
			return "B" + Integer.toString(groundFloor - index);
		} else {
			return Integer.toString((index - groundFloor) + 1);
		}

	}

	/**
	 * Returns in index of a given floor
	 *
	 * @param floor String that represents the given floor to find the index of
	 * @return index integer representing the given floor
	 */
	public int getFloorIndex(String floor) {
		if (floor.equals("G")) {
			return groundFloor;
		} else if (floor.startsWith("B")) {
			return groundFloor - Integer.parseInt(floor.substring(1));
		} else {
			return Integer.parseInt(floor) + groundFloor - 1;
		}

	}

	public boolean addOccupants(Passenger p) {
		if (occupants.size() < capacity) {
			occupants.add(p);
			return true;
		} else {
			return false;
		}
	}

	public void addLine(String flr, Line ln) {
		int index = getFloorIndex(flr);
		lines.set(index, ln);
	}

	/**
	 * Moves the elevator up/down depending on current direction and if it has reached the end of its path. Loads and
	 * unloads elevator for the current floor from the floor's line
	 */
	public void move() {
		if (currentDir == Direction.UP && currentFloor < numFloors - 1) {
			currentFloor++;
		}
		if (currentDir == Direction.UP && currentFloor == numFloors - 1) {
			currentDir = Direction.DOWN;
			currentFloor--;
		}
		if (currentDir == Direction.DOWN && currentFloor > 0) {
			currentFloor--;
		}
		if (currentDir == Direction.DOWN && currentFloor == 0) {
			currentDir = Direction.UP;
			currentFloor++;
		}

		Iterator<Passenger> iter = occupants.iterator();
		while (iter.hasNext()) {
			Passenger p = iter.next();
			if (getFloorIndex(p.getDestinationFloor()) == currentFloor) {
				iter.remove();
			}

		}

		if (lines.get(currentFloor) != null) {
			lines.get(currentFloor).loadElevator();
		}
	}


}
