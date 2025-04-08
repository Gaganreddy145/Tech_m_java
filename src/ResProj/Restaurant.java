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

	public static void main(String[] args) {
		Restaurant r = new Restaurant("Satyam");
		r.lm.add(new Menu(1, "Dosa", 80));
		r.lm.add(new Menu(2, "Idli", 50));
		r.lm.add(new Menu(3, "Puri", 100));
		Customer c1 = new Customer(101, "Mahesh");
		Customer c2 = new Customer(102, "Beggar");
		r.lc.add(c1);
		r.lc.add(c2);
		Order o = c1.addOrder(r.lm,r.lo);
		if (o != null) {
			r.lo.add(o);
		}
		Order o1 = c1.addOrder(r.lm,r.lo);
		if (o1 != null) {
			r.lo.add(o1);
		}
		Order o2 = c2.addOrder(r.lm,r.lo);
		if (o2 != null) {
			r.lo.add(o2);
		}
		System.out.println(r.lo);
	}

}
