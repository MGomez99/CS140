package lab04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListPractice {
	public static int intRemoveAll(List<Integer> arr, int e) {
		Iterator<Integer> iter = arr.iterator();
		int removed = 0;
		while (iter.hasNext()) {
			if (iter.next() == e) {
				iter.remove();
				removed++;
			}
		}
		return removed;
	}

	public static boolean isEqual(List<Integer> alpha, List<Integer> other) {
		if (alpha.size() == other.size()) {
			for (int iter = 0; iter < alpha.size(); iter++) {
				if (!alpha.get(iter).equals(other.get(iter))) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	public static void appendArray(List<Integer> arrList, int[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Array is null");
		} else {
			for (int iter = 0; iter < arr.length; iter++) {
				arrList.add(arr[iter]);
			}
		}
	}

	public static List<Integer> sumElementWise(List<Integer> arr1, List<Integer> arr2) {
		if (arr1 == null | arr2 == null) {
			throw new IllegalArgumentException("Array Lists can't be null!");
		}
		List<Integer> sum = new ArrayList<>();
		List<Integer> largest;
		List<Integer> smallest;
		if (arr1.size() > arr2.size()) {
			largest = arr1;
			smallest = arr2;
		} else {
			largest = arr2;
			smallest = arr1;
		}
		int count = 0;
		for (int iter = 0; iter < smallest.size(); iter++) {
			sum.add(largest.get(iter) + smallest.get(iter));
			count++;
		}
		while (count < largest.size()) {
			sum.add(largest.get(count));
			count++;
		}
		return sum;
	}
}


