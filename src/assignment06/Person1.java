package assignment06;

import java.time.LocalDate;
import java.util.Comparator;

class Person1 implements Comparable<Person1> {
	private String firstName;
	private String lastName;
	private long ssn;
	private LocalDate dob;

	public Person1(String fstN, String lstN, long n, LocalDate d) {
		firstName = fstN;
		lastName = lstN;
		ssn = n;
		dob = d;
	}

	@Override
	public int compareTo(Person1 arg0) {
		// compare last names, if they're the same, compare 1ast names
		if (this.lastName.compareToIgnoreCase(arg0.lastName) != 0) {
			return this.lastName.compareToIgnoreCase(arg0.lastName);
		}
		return this.lastName.compareToIgnoreCase(arg0.firstName);
	}

	public Comparator<Person1> bySSN() {
		return new Comparator<Person1>() {
			@Override
			public int compare(Person1 p1, Person1 p2) {
				if (p1.ssn > p2.ssn) {
					return 1;
				} else if (p2.ssn > p1.ssn) {
					return -1;
				} else {
					return 0; // SSN's shouldn't be the same but it's just in case they are
				}
			}
		};
	}

	public Comparator<Person1> byDOB() {
		return new Comparator<Person1>() {
			@Override
			public int compare(Person1 p1, Person1 p2) {
				return p1.dob.compareTo(p2.dob);
			}
		};

	}

	public String toSSN() {
		String s = "000000000" + ssn;
		s = s.substring(s.length() - 9);
		return s.substring(0, 3) + "-" + s.substring(3, 5)
				+ "-" + s.substring(5);
	}

}
