package assignment08;

import java.util.ArrayList;
import java.util.Arrays;

class SubElasticSlidingWindowGenerator {
	private static <T> ArrayList<ArrayList<ArrayList<T>>> windowSubLists(ArrayList<T> list) {
		ArrayList<ArrayList<ArrayList<T>>> retVal = new ArrayList<>();
		return windowSubListsHelper(list, retVal, 0, 0);
	}

	private static <T> ArrayList<ArrayList<ArrayList<T>>> windowSubListsHelper
			(ArrayList<T> origList, ArrayList<ArrayList<ArrayList<T>>> subLists, int beginIndex, int endI) {
		if (beginIndex == origList.size()) {
			return subLists;
		}

		for (int endIndex = endI; endIndex < origList.size(); endIndex++) {
			ArrayList<ArrayList<T>> result = new ArrayList<>();
			ArrayList<T> largest = new ArrayList<>();

			for (int i = 0; i < origList.size(); i++) {
				if (i >= beginIndex && i <= endIndex) {
					largest.add(origList.get(i));
					if (i == endIndex) {
						if (largest.size() > 0) {
							result.add(largest);
						}
					}
				} else {
					ArrayList<T> temp = new ArrayList<>();
					temp.add(origList.get(i));
					result.add(temp);
				}

			}
			if (!subLists.contains(result)) {
				subLists.add(result);
			}

		}


		return windowSubListsHelper(origList, subLists, beginIndex + 1, endI + 1);
	}

	public static void main(String[] args) {
		System.out.println(windowSubLists(new ArrayList<Integer>(Arrays.asList(1, 7, 2, 9, 11))));
	}
}