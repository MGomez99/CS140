package assignment08;

import java.util.ArrayList;
import java.util.List;

class Major {
	private String name;
	private List<Student> studentsInMajor;

	public Major(String str) {
		name = str;
		studentsInMajor = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Student> getStudentsInMajor() {
		return studentsInMajor;
	}

	public void addStudent(Student s) {
		studentsInMajor.add(s);
	}

	public void setMajors() {
		studentsInMajor.stream().filter(s -> s.getMajor().equals("undeclared")).forEach(s -> s.setMajor(name));
	}
}
