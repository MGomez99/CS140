package assignment01;

class Name {
	private String name;
	private String friends = "";

	public Name(String nm) {
		name = nm;
		if (nm.indexOf(' ') >= 0) {
			throw new IllegalArgumentException("No Spaces in Names");
		}
	}

	public void befriend(Name n) {
		friends += n.name + " ";
	}

	public void unfriend(Name n) {
		friends = friends.replace(n.name + " ", "");
	}

	public String getFriendNames() {
		return friends;
	}

	public int getFriendCount() {
		int number_of_friends = 0;
		for (char c : friends.toCharArray()) {
			if (c == ' ') {
				number_of_friends++;
			}
		}
		return number_of_friends;
	}
}
