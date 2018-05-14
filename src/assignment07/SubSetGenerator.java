package assignment07;

import java.util.ArrayList;
import java.util.List;

class SubSetGenerator {

	private static List<String> subSet(String base) {
		List<String> result = new ArrayList<>();
		//base case, empty str
		if (base.length() == 0) {
			result.add(base);
			return result;
		}
		List<String> recurse = subSet(base.substring(1));
		//for each subset we got, add the subset+chopped off character
		for (String simpleSub : recurse) {
			if (!result.contains(simpleSub)) {
				result.add(base.charAt(0) + simpleSub);
			}
		}
		//now add the subset itself
		for (String simpleSub : recurse) {
			if (!result.contains(simpleSub)) {
				result.add(simpleSub);
			}
		}
		//fini
		return result;
	}


	public static void main(String[] args) {
		System.out.println("\t\t*****************Testing*****************\n");
		System.out.println(subSet("rum"));
		System.out.println(subSet("app"));
	}
}

