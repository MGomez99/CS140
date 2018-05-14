package assignment01;

class Driver2 {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane Smith", 100.0);
		System.out.println(cust);

		Customer cust2 = new Customer("John Doe", 105.0);
		System.out.println(cust2);
		System.out.println("Customer 1 has more funds than customer 2: " + cust.hasMoreFundsThan(cust2));
		System.out.println("Customer 2 has more funds than customer 1: " + cust2.hasMoreFundsThan(cust));
	}
}
