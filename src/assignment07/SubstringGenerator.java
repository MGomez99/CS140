package assignment07;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class SubstringGenerator {

	private static Set<String> subStrings(String base) {
		TreeSet<String> result = new TreeSet<>();

		return StringHelper(base, result);

	}

	private static TreeSet<String> StringHelper(String base, TreeSet<String> result) {
		//empty string; base case
		if (base.length() == 0) {
			result.add(base);
			return result;
		}
		//enumerate all substrings that start with this char
		for (int i = base.length(); i > 0; i--) {
			String sub = base.substring(0, i);
			result.add(sub);
		}
		//cut of 1st character for new base string
		return StringHelper(base.substring(1), result);
	}


	private static List<String> subStrings1(String base) {
		List<String> result = new ArrayList<>();
		result = subStringsHelper(base, result);
		return result;
	}

	private static List<String> subStringsHelper(String base, List<String> temp) {
		//if empty, add empty char and return (you've reached the end!)
		if (base.length() == 0) {
			temp.add(base);
			return temp;
		}
		//number of substrings with base[n] as the first term
		for (int n = 0; n < base.length(); n++) {
			//can't do 0[inclusive] to 0[exclusive], method is exclusive on its upper bound so no exception
			String sub = base.substring(0, n + 1);
			//add the substring we've found
			temp.add(sub);
		}
		//recurse! pretty sure this works so i won't break whats not broken
		return subStringsHelper(base.substring(1), temp);

	}

	public static void main(String[] args) {
		System.out.println("\t\t*****************Testing*****************\n");
		System.out.println(subStrings("rum"));
		System.out.println(subStrings1("rum"));
	}
}
