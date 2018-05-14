package lab04;

import java.util.ArrayList;
import java.util.List;

class Roster {
	private List<Student> classRoster = new ArrayList<>();

	public List<Student> getClassRoster() {
		return classRoster;
	}

	public void addStudent(Student s) {
		classRoster.add(s);
	}

	public void dropStudent(String name) {
		int count = 0;
		List<Student> tempClassRoster = new ArrayList<>();
		for (Student student : classRoster) {
			tempClassRoster.add(student);
		}
		for (Student student : tempClassRoster) {
			if (name.equals(student.getName())) {
				classRoster.remove(count);
			}
			count++;
		}

	}

	public String toString() {
		String names = "";
		for (Student student : classRoster) {
			names += " " + student.getName() + ",";
		}
		return "[" + names.substring(0, names.length() - 1).trim() + "]";
	}

	public void sortByID() {
		for (int i = 0; i < classRoster.size(); i++) {
			for (int j = 1; j < classRoster.size() - i; j++) {

				if (classRoster.get(j - 1).getId() > classRoster.get(j).getId()) {
					Student temp = classRoster.get(j - 1);
					classRoster.set(j - 1, classRoster.get(j));
					classRoster.set(j, temp);
				}
			}
		}
	}
}
