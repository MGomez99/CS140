package lab08;

class Bonus {
	private static void printPascalsTriangle(int limit) {

		for (int currentline = 0; currentline <= limit; currentline++) { //num of prints depends on current line

			for (int i = 0; i <= currentline; i++) {
				System.out.print(Recursion.binomialCoefficient(currentline, i) + " "); //using the predef. function
			}
			System.out.println("\n");//go to next line in the triangle
		}
	}

	public static void main(String[] args) {
		int i = 5;
		printPascalsTriangle(i);
	}
}
