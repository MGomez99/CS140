package lab05;

import java.util.List;

class FunWithStrings {
	public static void swapMaxes(List<String> list1, List<String> list2) {
		if (list1.size() == 0 || list2.size() == 0) {
			throw new IllegalArgumentException("cannot swap maxes of empty lists, null lists, or lists with all null elements");
		} else {
			String temp1 = "";
			String temp2 = "";
			int index1 = 0;
			int index2 = 0;
			int count = 0;

			for (String string : list1) {
				if (string.length() > temp1.length()) {
					temp1 = string;
					index1 = count;
				}
				count++;
			}
			count = 0;
			for (String string : list2) {
				if (string.length() > temp2.length()) {
					temp2 = string;
					index2 = count;
				}
				count++;
			}

			list1.set(index1, temp2);
			list2.set(index2, temp1);
		}

	}
}
