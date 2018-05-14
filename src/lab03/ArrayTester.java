package lab03;

import java.util.Arrays;

class ArrayTester {
	public static void main(String[] args) {

		if (args.length == 1) {
			ArrayFromFile Arr = new ArrayFromFile(args[0]);
			System.out.println("Expected result for input.txt:\n[20, 8, 13, 46, 7]");
			System.out.println("Result:");
			System.out.println(Arr);

			Arr.removeOddElements();
			System.out.println("Expected result after removing odd ele.:\n[20, 8, 46]");
			System.out.println("Result:");
			System.out.println(Arr + "\n");

			int[] intarray = new int[5];
			System.out.println(Arrays.toString(intarray));
			int n = 0;
			for (int i : intarray) {
				i = n;
				n++; // shorthand to increment by 1
			}
			System.out.println(Arrays.toString(intarray) + "\tstill zeroes...\n");//still zeroes

			String[] stringArr = {"Computer", "Science", "Java", "Python"};

			for (String s : stringArr) {
				System.out.println(s + " " + s.length());
			}

		} else {
			throw new IllegalArgumentException("The program requires one argument");
		}

	}
}
