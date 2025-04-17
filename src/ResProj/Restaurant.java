package ResProj;

import java.time.LocalDate;
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

	public void updateMenuItem(int id, double price) {
		for (Menu m : lm) {
			if (m.getId() == id) {
				m.setPrice(price);
				System.out.println("Successfully updated!!!");
				return;
			}
		}
		System.out.println("No such item!!!");
	}

	public void removeMenuItem(int id) {
		int found = 0;
		for (Menu m : lm) {
			if (m.getId() == id) {
				lm.remove(m);
				found = 1;
				break;
			}
		}
		if (found == 1) {
			System.out.println("Successfully Removed the Item");
		} else {
			System.out.println("No such item");
		}
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

	public HashMap<String, Integer> generateTotalCountByItemsForToday() {
		HashMap<String, Integer> todayItems = new HashMap<>();
		LocalDate today = LocalDate.now();
		for (Order o : lo) {
			if (o.currentDate.compareTo(today) == 0) {
				if (todayItems.containsKey(o.getM().getName())) {
					todayItems.put(o.getM().getName(), todayItems.get(o.getM().getName()) + o.getQuantity());
				} else {
					todayItems.put(o.getM().getName(), o.getQuantity());
				}
			}
		}
		return todayItems;
	}

	public String todayHighestOrderItem() {
		HashMap<String, Integer> todayItems = generateTotalCountByItemsForToday();
		int max = Integer.MIN_VALUE;
		String item = null;
		for (String key : todayItems.keySet()) {
			if (max < todayItems.get(key)) {
				max = todayItems.get(key);
				item = key;
			}
		}
		return item;
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
		HashMap<String, Integer> todayItems = r.generateTotalCountByItemsForToday();
		for (String food : todayItems.keySet()) {
			System.out.println(food + " : " + todayItems.get(food));
		}
		String highestOrderedItemToday = r.todayHighestOrderItem();
		if (highestOrderedItemToday == null) {
			System.out.println("No item available");
		} else {
			System.out.println(highestOrderedItemToday);
		}

//		r.removeMenuItem(1);
//		r.updateMenuItem(1, 60);
//		r.displayMenu();

	}

}
