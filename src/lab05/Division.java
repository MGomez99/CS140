package lab05;

import java.util.ArrayList;
import java.util.List;

class Division {
	private List<Double> list = new ArrayList<>();

	public Division(double[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("need to enter an arra with at least one double");
		} else {
			for (double item : array) {
				list.add(item);
			}
		}
	}

	public void removeZeroes() {
		List<Double> temp = new ArrayList<>();
		for (Double item : list) {
			if (item != 0) {
				temp.add(item);
			}
		}
		list = temp;
	}

	public void divide(int divisor) {
		List<Double> temp = new ArrayList<>();
		if (divisor == 0) {
			throw new IllegalArgumentException("cannot divide by zero");
		}
		for (Double item : list) {
			temp.add(item / ((double) divisor));
		}
		list = temp;
	}

	public String toString() {
		return list.toString();
	}
}
