package assignment05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuestionTester {
	private ChoiceQuestion choice = new ChoiceQuestion("Who founded Microsoft?");
	private MultichoiceQuestion mchoice = new MultichoiceQuestion("What is the solution to (x^2) - 1 = 0?");

	@Before
	public void initialize() {
		choice.addChoice("Steve Jobs", false);
		choice.addChoice("Donald Glover", false);
		choice.addChoice("Bill Gates", true);
		choice.addChoice("Donald Trump", false);

		mchoice.addChoice("x = 2", false);
		mchoice.addChoice("x = 1", true);
		mchoice.addChoice("x = 0", false);
		mchoice.addChoice("x = -1", true);

	}

	@Test
	public void testChoiceQuestion() {
		choice.display();
		assertTrue(choice.checkAnswer("3"));
		assertFalse(choice.checkAnswer("4"));
		System.out.println("\n");
	}

	@Test
	public void testMultiChoiceQuestion() {
		mchoice.display();
		assertTrue(mchoice.checkAnswer("2 4"));
		assertFalse(mchoice.checkAnswer("1 2 4 "));
		assertFalse(mchoice.checkAnswer("2"));
		assertFalse(mchoice.checkAnswer("3 4"));

	}
}
