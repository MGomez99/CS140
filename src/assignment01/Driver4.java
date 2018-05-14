package assignment01;


class Driver4 {
	public static void main(String[] args) {
		Name Joe = new Name("Joe");
		Name Jane = new Name("Jane");
		Name Jack = new Name("Jack");
		Name Jill = new Name("Jill");
		Joe.befriend(Jane);
		Joe.befriend(Jack);
		Joe.befriend(Jill);

		System.out.println("Joe currently has " + Joe.getFriendCount() + " friends.");
		System.out.println("List of Friends: " + Joe.getFriendNames() + "\n");

		Joe.unfriend(Jack);
		System.out.println("Joe got into a fight with Jack...");
		System.out.println("Joe currently has " + Joe.getFriendCount() + " friends.");
		System.out.println("List of Friends: " + Joe.getFriendNames() + "\n");
	}
}
