package assignment06;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestPerson {
	private Person p1 = new Person("John", "Doe", 11111, LocalDate.of(1999, 01, 01));
	private Person p2 = new Person("Jane", "Notdoe", 22222, LocalDate.of(1999, 01, 02));
	private Person p3 = new Person("Bill", "Gates", 12345, LocalDate.of(1955, 10, 28));
	private Person p4 = new Person("Miguel", "Gomez", 45678, LocalDate.of(1999, 11, 18));
	private List<Person> test = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

	@Test
	public void testCompareBySSN() {
		test.sort(Person.bySSN());
		List<Person> expected = new ArrayList<>(Arrays.asList(p1, p3, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByDOB() {
		test.sort(Person.byDOB());
		List<Person> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByName() {
		test.sort(Person::compareTo); //Method Reference
		List<Person> expected = new ArrayList<>(Arrays.asList(p1, p3, p4, p2));
		assertEquals(expected, test);
	}

}
