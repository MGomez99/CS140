package lab09;

import java.util.Comparator;

class Bonus {
	public static void main(String[] args) {
		//compares strings by their length
		Comparator<String> stringComp = (o1, o2) -> o1.length() - o2.length();
		BinarySearchTree<String> tree = new BinarySearchTree<>(stringComp);
		tree.insert("Jack");
		tree.insert("Arturius");
		tree.insert("Emilia");
		tree.insert("Rin");
		tree.insert("Mordred");
		tree.prettyPrint();
	}
}