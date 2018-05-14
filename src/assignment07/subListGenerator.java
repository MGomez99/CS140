package assignment07;

import java.util.ArrayList;
import java.util.Arrays;

class subListGenerator {

	private static <T> ArrayList<ArrayList<ArrayList<T>>> subLists(ArrayList<T> list) {
		//the retval for the function
		ArrayList<ArrayList<ArrayList<T>>> sublist = new ArrayList<>();

		//base case
		if (list.size() == 1) {
			sublist.add(new ArrayList<ArrayList<T>>());
			sublist.get(0).add(new ArrayList(Arrays.asList(list.get(0))));
			return sublist;
		}
		//removed element to add on later after the recursive calls
		T removed = list.remove(list.size() - 1);
		//recurse on list without last element
		ArrayList<ArrayList<ArrayList<T>>> recurse = subLists(list);// [1,7,3] ->[ [1, 7, 2], [[1, 7], [2]] ]
		for (ArrayList<ArrayList<T>> minilist : recurse) {

			ArrayList<ArrayList<T>> copy1 = new ArrayList<>();
			ArrayList<ArrayList<T>> copy2 = new ArrayList<>();
			for (ArrayList<T> item : minilist) {
				//making deep copies the hard way since .clone() didn't work
				ArrayList<T> newlist1 = new ArrayList<>();
				ArrayList<T> newlist2 = new ArrayList<>();
				for (T element : item) {
					newlist1.add(element);
					newlist2.add(element);
				}
				copy1.add(newlist1);
				copy2.add(newlist2);
			}
			//now that I have copies, add the removed element in the 2 different possible ways
			//way 1, as a different element in the list and add to sublist
			copy1.add(new ArrayList<>(Arrays.asList(removed)));
			sublist.add(copy1);
			//way 2, as an addition to the last element in the list
			copy2.get(copy2.size() - 1).add(removed);
			sublist.add(copy2);

		}

		return sublist;
	}


	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 7, 2, 9));
		System.out.println("\t\t*****************Testing*****************\n");
		System.out.println("Result:\t" + subLists(nums));
	}

}
