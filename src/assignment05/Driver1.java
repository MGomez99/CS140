package assignment05;

class Driver1 {
	public static void main(String[] args) {
		System.out.println("Problem 1\n");
		Parent p = new Parent();
		p.setpName("Tom");
		p.print();
		p = new Child();
		p.setpName("Dick");
		((Child) p).setcName("Harry");
		p.print();
	}
}
