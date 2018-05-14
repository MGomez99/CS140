package lab03;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class ArrayFromFile {
	private int[] array;

	public ArrayFromFile(String filename) {
		// try-with-resources block (sc is the resource we are trying to use)
		try (Scanner sc = new Scanner(new File(filename))) {
			int lines = sc.nextInt();
			array = new int[lines];
			for (int i = 0; i < lines; i++) {
				array[i] = sc.nextInt();
			}
		} catch (Exception e) {
			array = new int[0];
		}
	}

	public int[] getArray() {
		return array;
	}

	public String toString() {
		return Arrays.toString(array);
	}

	public void removeOddElements() {
		int num_even = 0; // number of even elements
		for (int i : array) {
			if (i % 2 == 0) {
				num_even++;
			}
		}
		int[] temp = new int[num_even];
		int n = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				temp[n] = i; // if it's even, add it to temp
				n++;
			}
		}
		array = temp;
	}


}
