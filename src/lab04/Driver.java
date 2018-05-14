package lab04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Driver {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));
		int e = 4;
		System.out.println("Using list: " + arr + " and int " + e);
		System.out.println("intRemoveAll result : " + ArrayListPractice.intRemoveAll(arr, e) + "\n\n");

		List<Integer> other = new ArrayList<>(Arrays.asList(1, 2, 3));
		System.out.println("Lists to use for isEqual: " + arr + ", " + other);
		System.out.println("isEqual result: " + ArrayListPractice.isEqual(arr, other) + "\n\n");

		int[] toAdd = {4, 5, 6};
		System.out.println("ArrayLists and Array to use: " + arr + ", " + Arrays.toString(toAdd));
		ArrayListPractice.appendArray(arr, toAdd);
		System.out.println("appendArray result: " + arr + "\n\n");


		List<Integer> arr2 = new ArrayList<>(Arrays.asList(7, 8, 9));
		System.out.println("Array Lists to Use: " + arr + ", " + arr2);
		System.out.println("sumElementWise result: " + ArrayListPractice.sumElementWise(arr, arr2));
	}
}
