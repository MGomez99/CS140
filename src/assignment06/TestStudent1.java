package assignment06;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestStudent1 {
	private Student1 p1 = new Student1("John", "Doe", 11111, LocalDate.of(1999, 01, 01), 3.5);
	private Student1 p2 = new Student1("Jane", "Notdoe", 22222, LocalDate.of(1999, 01, 02), 3.6);
	private Student1 p3 = new Student1("Bill", "Gates", 12345, LocalDate.of(1955, 10, 28), 0.00);
	private Student1 p4 = new Student1("Miguel", "Gomez", 45678, LocalDate.of(1999, 11, 18), 3.9);
	private List<Student1> test = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
	private Comparator<Student1> bydob = p1.byDOB();
	private Comparator<Student1> byssn = p1.bySSN();
	private Comparator<Student1> bygpa = p1.byGPA();


	@Test
	public void testCompareBySSN() {
		Collections.sort(test, byssn);
		List<Student1> expected = new ArrayList<>(Arrays.asList(p1, p3, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByDOB() {
		Collections.sort(test, bydob);
		List<Student1> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByName() {
		Collections.sort(test);
		List<Student1> expected = new ArrayList<>(Arrays.asList(p1, p3, p4, p2));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByGPA() {
		Collections.sort(test, bygpa);
		List<Student1> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testToSSN() {
		assertEquals("000-04-5678", p4.toSSN());
	}
}
