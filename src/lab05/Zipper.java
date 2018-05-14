package lab05;

class Zipper {
	public static int[] zip(int[] arr1, int[] arr2) {

		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			throw new IllegalArgumentException("bad input");
		}
		if (arr1.length == 0 || arr2.length == 0) {
			return new int[0];
		}

		int[] temp = new int[arr1.length + arr2.length];
		int count = 0;
		for (int i = 0; i < arr1.length + arr2.length; i += 2) {
			temp[i] = arr1[count];
			temp[i + 1] = arr2[count];
			count++;
		}
		return temp;
	}
}
