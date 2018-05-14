package assignment06;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestPerson1 {
	private Person1 p1 = new Person1("John", "Doe", 11111, LocalDate.of(1999, 01, 01));
	private Person1 p2 = new Person1("Jane", "Notdoe", 22222, LocalDate.of(1999, 01, 02));
	private Person1 p3 = new Person1("Bill", "Gates", 12345, LocalDate.of(1955, 10, 28));
	private Person1 p4 = new Person1("Miguel", "Gomez", 45678, LocalDate.of(1999, 11, 18));
	private List<Person1> test = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
	private Comparator<Person1> bydob = p1.byDOB();
	private Comparator<Person1> byssn = p1.bySSN();

	@Test
	public void testCompareBySSN() {
		Collections.sort(test, byssn);
		List<Person1> expected = new ArrayList<>(Arrays.asList(p1, p3, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByDOB() {
		Collections.sort(test, bydob);
		List<Person1> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByName() {
		Collections.sort(test);
		List<Person1> expected = new ArrayList<>(Arrays.asList(p1, p3, p4, p2));
		assertEquals(expected, test);
	}

}
