package assignment04;


class Visualizer {

	private static void showElev(Elevator e) {
		for (int i = (e.getNumFloors() - 1); i > 0; i--) {
			Line line = e.getLines().get(i);
			String s = "";
			if (line != null) {
				if (line.getLine() == null || line.getLine().size() == 0) {
					s = "";
				} else if (line.getLine() != null) {
					s = "" + line.getLine();
				}
			}
			if (i == e.getCurrentFloor()) {
				System.out.println(e.getFloorName(i) + ">\t\t" + e.getNumOccupants() + "\t\t" + s);
			} else {
				System.out.println(e.getFloorName(i) + "\t\t0" + "\t\t" + s);
			}
			System.out.println("+++++++++++++++++++++");
		}
	}

	public static void main(String[] args) {
		Elevator elev = new Elevator(15, 5, 10);
		Line myLine = new Line("G", elev);
		//Making passengers for the elevator
		for (int i = 0; i < 6; i++) {
			myLine.getLine().add(new Passenger("7", elev));
		}
		for (int i = 0; i < 3; i++) {
			myLine.getLine().add(new Passenger("3", elev));
		}
		for (int i = 0; i < 3; i++) {
			myLine.getLine().add(new Passenger("B3", elev));
		}
		Line myLine4 = new Line("7", elev);
		//Making passengers for the elevator
		for (int i = 0; i < 4; i++) {
			myLine4.getLine().add(new Passenger("B1", elev));
		}
		for (int i = 0; i < 2; i++) {
			myLine4.getLine().add(new Passenger("G", elev));
		}
		for (int i = 0; i < 4; i++) {
			myLine4.getLine().add(new Passenger("3", elev));
		}

		showElev(elev);
		elev.getLines().get(elev.getCurrentFloor()).loadElevator(); //NEW
		for (int i = 0; i < 21; i++) {
			showElev(elev);
			elev.move();
			System.out.println();

		}
	}
}
