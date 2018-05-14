package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Tester {
	public static void main(String[] args) {
		Student Jack = new Student();
		Student Jill = new Student();
		Student John = new Student();
		Student Jane = new Student();
		Student Larkin = new Student();
		Student Thomas = new Student();
		Jack.setName("Jack");
		Jill.setName("Jill");
		John.setName("John");
		Jane.setName("Jane");
		Larkin.setName("Larkin");
		Thomas.setName("Thomas");

		Jack.setNumCreditsApplied(12);
		Jill.setNumCreditsApplied(34);
		John.setNumCreditsApplied(56);
		Jane.setNumCreditsApplied(18);
		Larkin.setNumCreditsApplied(28);
		Thomas.setNumCreditsApplied(24);

		Major ComputerScience = new Major("Computer Science");
		Major Math = new Major("Math");
		for (Student S : new ArrayList<>(Arrays.asList(Jack, Jane, John))) {
			Math.addStudent(S);
		}
		for (Student S : new ArrayList<>(Arrays.asList(Jill, Larkin, Thomas))) {
			ComputerScience.addStudent(S);
		}
		ComputerScience.setMajors();
		Math.setMajors();
		System.out.println(getSortedList(Arrays.asList(ComputerScience, Math)));
	}

	private static List<Student> getSortedList(List<Major> lst) {
		Comparator<Student> comp = (Student a, Student b) -> a.getNumCreditsApplied() - (b.getNumCreditsApplied());

		return lst.stream().flatMap(Maj -> Maj.getStudentsInMajor().stream()).sorted(comp).collect(Collectors.toList());
	}

}
