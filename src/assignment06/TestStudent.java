package assignment06;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestStudent {
	private Student p1 = new Student("John", "Doe", 11111, LocalDate.of(1999, 01, 01), 3.5);
	private Student p2 = new Student("Jane", "Notdoe", 22222, LocalDate.of(1999, 01, 02), 3.6);
	private Student p3 = new Student("Bill", "Gates", 12345, LocalDate.of(1955, 10, 28), 0.00);
	private Student p4 = new Student("Miguel", "Gomez", 45678, LocalDate.of(1999, 11, 18), 3.9);
	private List<Student> test = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

	@Test
	public void testCompareBySSN() {
		test.sort(Student.bySSN());
		List<Student> expected = new ArrayList<>(Arrays.asList(p1, p3, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByDOB() {
		test.sort(Student.byDOB());
		List<Student> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByName() {
		Collections.sort(test);
		List<Student> expected = new ArrayList<>(Arrays.asList(p1, p3, p4, p2));
		assertEquals(expected, test);
	}

	@Test
	public void testCompareByGPA() {
		test.sort(Student.byGPA());
		List<Student> expected = new ArrayList<>(Arrays.asList(p3, p1, p2, p4));
		assertEquals(expected, test);
	}

	@Test
	public void testToSSN() {
		assertEquals("000-04-5678", p4.toSSN());
	}
}
