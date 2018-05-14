package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class assignment8 {
	private static List<String> selectFrom(List<String> lst, char letter) {
		String character = Character.toString(letter);

		return lst.stream().filter(e -> e.toUpperCase().substring(0, 1).equalsIgnoreCase(character))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "delta", "Binghamton",
				"academic", "business"));
		System.out.println(lst);
		System.out.println(selectFrom(lst, 'b'));
	}

}
