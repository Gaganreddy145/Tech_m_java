package ResProj;

import java.util.*;

public class Restaurant {
	private String name;
	List<Customer> lc;
	List<Menu> lm;
	List<Order> lo;

	@Override
	public String toString() {
		return "Restaurant [name=" + name + "]";
	}

	public Restaurant(String name) {
		super();
		this.name = name;
		lc = new ArrayList<>();
		lm = new ArrayList<>();
		lo = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void createOrder(Menu requestedItem, Customer c) {
		Order exist = null;
		for (Order ord : lo) {
			if (ord.getM().getId() == requestedItem.getId() && ord.getC().getId() == c.getId()) {
				exist = ord;
			}
		}
		if (exist != null) {
			exist.setQuantity(exist.getQuantity() + 1);
			return;
		}
		Order o = new Order(requestedItem, c);
		lo.add(o);
	}

	public double calculateBill(Customer c) {
		double total = 0;
		for (Order ord : lo) {
			if (ord.getC().getId() == c.getId()) {
				total += ord.getM().getPrice() * ord.getQuantity();
			}
		}
		return total;
	}

	public void displayMenu() {
		for (Menu m : lm) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Restaurant r = new Restaurant("Satyam");
		r.lm.add(new Menu(1, "Dosa", 80));
		r.lm.add(new Menu(2, "Idli", 50));
		r.lm.add(new Menu(3, "Puri", 100));
		Customer c1 = new Customer(101, "Mahesh");
		Customer c2 = new Customer(102, "Beggar");
		r.lc.add(c1);
		r.lc.add(c2);
		char ch = 'n';
		do {
			r.displayMenu();
			System.out.print("Enter the id of the item: ");
			int id = sc.nextInt();
			Menu requestedItem = c1.addOrder(r.lm, id);
			if (requestedItem != null) {
				r.createOrder(requestedItem, c1);
			} else {
				System.out.println("No such item!!!");
			}
			System.out.print("Do u want to add more items? ");
			sc.nextLine();
			ch = sc.nextLine().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
		System.out.println("Total Bill: " + r.calculateBill(c1));
		System.out.println(r.lo);
	}

}
