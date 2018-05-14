package lab04;

class RosterTester {

	public static void main(String[] args) {
		Roster myRoster = new Roster();
		Student Jack = new Student(7, "Jack");
		Student Jill = new Student(2, "Jill");
		Student John = new Student(1, "John");
		Student Jane = new Student(5, "Jane");

		myRoster.addStudent(Jack);
		myRoster.addStudent(Jill);
		myRoster.addStudent(John);
		myRoster.addStudent(Jane);

		System.out.println("Roster: " + myRoster);
		myRoster.dropStudent("Jill");
		System.out.println("Updated Roster[post-drop]: " + myRoster);

		myRoster.sortByID();
		System.out.println("Updated Roster[sorted]: " + myRoster);

		for (Student student : myRoster.getClassRoster()) {
			System.out.println("Student name: " + student.getName() + "\nID: " + student.getId());
		}

	}
}
