package Test2Review;

import java.util.List;
import java.util.stream.Collectors;

class Review {
	//Streams
	public static List<Integer> squares(List<Integer> list) {
		return list.stream().map(e -> e * e).collect(Collectors.toList());
	}

	private static int sigma(int low, int high, Function f) {
		if (low > high) {
			throw new IllegalArgumentException();
		}
		if (low == high) {
			return f.func(high);
		}
		return f.func(low) + sigma(low + 1, high, f);
	}

	//Recursion
	private int countOccurences(String str, char c) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.charAt(0) == c) {
			return 1 + countOccurences(str.substring(1), c);
		}
		return 0 + countOccurences(str.substring(1), c);
	}

	public int sumOdd(List<Integer> list) {
		return list.stream().filter(e -> e % 2 == 1).reduce(0, (a, b) -> a + b);
	}
}
