package aggregation;

import java.util.*;

public class Saloon {

	String salName, location;
	List<Customer> lc = new ArrayList<>();

	Saloon(String salName, String location) {
		this.salName = salName;
		this.location = location;
	}

	public void addCustomer(Customer c) {
		lc.add(c);
	}

	public void displaySaloonInfo() {
		System.out.println("Name: " + salName + " Location: " + location);
	}

	public int countCustomers() {
		return lc.size();
	}

	public List<Customer> startsWith(char pre) {
		List<Customer> lcs = new ArrayList<>();
		for (Customer c : lc) {
			if (c.name.charAt(0) == pre) {
				lcs.add(c);
			}
		}
		return lcs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Saloon s = new Saloon("Abdul's Saloon", "Maharanipeta");
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter id of the customer: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter style: ");
			String style = sc.nextLine();

			s.addCustomer(new Customer(id, name, style));
		}
		System.out.println("No of Customers are: " + s.countCustomers());
		System.out.print("Enter the starting character to search the Customers: ");
		char ch = sc.next().charAt(0);
		sc.close();
		List<Customer> lcs = s.startsWith(ch);
		for (Customer c : lcs) {
			System.out.println(c.name);
		}
		if (lcs.size() == 0)
			System.out.println("No customers found!!!");

	}

}
