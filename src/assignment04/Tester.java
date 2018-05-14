package assignment04;

class Tester {
	public static void main(String[] args) {
		Elevator myElev = new Elevator(15, 5, 10);
		System.out.println("Num Floors: 15, GF: 5\n");
		System.out.println("\nUpper Floor Test: '6'/i=10");
		System.out.println("Index of '6'(Expected: 10): " + myElev.getFloorIndex("6"));
		System.out.println("Name of i=10(Expected '6'): " + myElev.getFloorName(10));

		System.out.println("\nGround Floor Test: 'G'");
		System.out.println("Index of 'G'(Expected: 5): " + myElev.getFloorIndex("G"));
		System.out.println("Name of i=5(Expected 'G'): " + myElev.getFloorName(5));

		System.out.println("\nBasement Floor Test: 'B1'/i=4");
		System.out.println("Index of B1(Expected: 4): " + myElev.getFloorIndex("B1"));
		System.out.println("Name of i=4(Expected 'B1'): " + myElev.getFloorName(4));
	}
}
