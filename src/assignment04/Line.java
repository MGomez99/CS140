package assignment04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Line {
	private String floor;
	private List<Passenger> line = new ArrayList<>();
	private Elevator elevator;

	public Line(String flr, Elevator elev) {
		floor = flr;
		elevator = elev;
		elev.addLine(flr, this);
	}

	public void loadElevator() {
		Iterator<Passenger> iter = line.iterator();
		int thisFloor = elevator.getFloorIndex(floor);

		if (elevator.getCurrentDir() == Direction.UP) {
			while (iter.hasNext()) {
				Passenger p = iter.next();
				if (elevator.getFloorIndex(p.getDestinationFloor()) > thisFloor) {
					if (elevator.addOccupants(p)) {
						iter.remove();
					}
				}
			}
		} else {
			while (iter.hasNext()) {
				Passenger p = iter.next();
				if (elevator.getFloorIndex(p.getDestinationFloor()) < thisFloor) {
					if (elevator.addOccupants(p)) {
						iter.remove();
					}
				}
			}

		}
	}


	public List<Passenger> getLine() {
		return line;
	}


}
