package assignment05;

import java.util.*;

public class MultichoiceQuestion extends Question {
	private List<String> choices = new ArrayList<>();
	private List<Integer> correctChoices = new ArrayList<>();

	public MultichoiceQuestion(String qText) {
		super(qText, "");
		choices = new ArrayList<>();
	}

	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			correctChoices.add(choices.size());
		}
	}

	@Override
	public boolean checkAnswer(String response) {
		int nCorrect = 0;
		int nIncorrect = 0;
		Set<Integer> answers = new HashSet<>();

		try (Scanner scan = new Scanner(response)) {
			while (scan.hasNextInt()) {
				int ans = scan.nextInt();
				answers.add(ans);
			}
		}
		for (int i : answers) {
			if (correctChoices.contains(i)) {
				nCorrect++;
			} else {
				nIncorrect++;
			}
		}
		if (correctChoices.size() == nCorrect && nIncorrect == 0) {
			return true;
		} else {
			System.out.println("Correct: " + nCorrect + ", Incorrect: " + nIncorrect);
			return false;
		}
	}

	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++) {
			System.out.println((i + 1) + ": " + choices.get(i));
		}
	}

	@Override
	public void presentQuestion() {
		display();
		System.out.print("Your answers (if more than one, separate answers by spaces): ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(checkAnswer(response));

	}
}
