package assignment06;

import java.time.LocalDate;
import java.util.Comparator;

class Student1 implements Comparable<Student1> {
	private Person1 individual;
	private double gpa;

	public Student1(String fstN, String lstN, long n, LocalDate d, double g) {
		individual = new Person1(fstN, lstN, n, d);
		gpa = g;
	}

	public int compareTo(Student1 p) {

		return individual.compareTo(p.individual);
	}

	public Comparator<Student1> bySSN() {
		return new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return individual.bySSN().compare(o1.individual, o2.individual);
			}
		};

	}

	public Comparator<Student1> byDOB() {
		return new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return individual.byDOB().compare(o1.individual, o2.individual);
			}
		};

	}

	public String toSSN() {
		return individual.toSSN();
	}

	public Comparator<Student1> byGPA() {
		return new Comparator<Student1>() {
			@Override
			public int compare(Student1 p1, Student1 p2) {
				if (p1.gpa > p2.gpa) {
					return 1;
				}
				if (p2.gpa > p1.gpa) {
					return -1;
				}
				return 0;
			}
		};
	}
}
