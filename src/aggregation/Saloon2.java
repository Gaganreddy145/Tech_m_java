package aggregation;

import java.util.*;

public class Saloon2 {
	String salName, location;
	Customer[] cs = new Customer[5];

	Saloon2(String salName, String location, Customer[] cs) {
		this.salName = salName;
		this.location = location;
		this.cs = cs;
	}

	public void displaySaloonInfo() {
		System.out.println("Name: " + salName + " Location: " + location);
	}

	public int countCustomers() {
		int count = 0;
		for (Customer c : cs) {
			if (c != null)
				count++;
		}
		return count;
	}

	public Customer[] startsWith(char pre) {
		Customer[] temp = new Customer[5];
		int i = 0;
		for (Customer c : cs) {
			if (c != null && c.name.charAt(0) == pre) {
				temp[i] = c;
				i++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer[] cs = new Customer[5];
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter id of the customer: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter style: ");
			String style = sc.nextLine();
			cs[i] = new Customer(id, name, style);
		}
		Saloon2 s = new Saloon2("Abdul's Saloon", "Maharanipeta", cs);
		System.out.println(s.countCustomers());
		System.out.print("Enter the starting character to search the Customers: ");
		char ch = sc.next().charAt(0);
		sc.close();
		Customer[] temp = s.startsWith(ch);
		for (Customer c : temp) {
			if (c != null)
				System.out.println(c.name);
		}
	}

}
