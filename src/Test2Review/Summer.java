package Test2Review;

class Summer {
	private double[] array;

	Summer(double[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException();
		}
		array = arr;
	}

	double measure() {
		int sum = 0;
		for (double i : array) {
			sum += i;
		}
		return sum;
	}

	int value() {
		if (array.length == 0) {
			return -1;
		}
		return array.length;
	}

}
