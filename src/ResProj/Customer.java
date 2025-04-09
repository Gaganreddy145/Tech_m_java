package ResProj;
import java.util.*;
public class Customer {
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	public Order addOrder(List<Menu> lm,List<Order> lo) {
		Scanner sc= new Scanner(System.in);
		for(Menu m:lm) {
			System.out.println(m);
		}
		System.out.print("Enter the id of the item: ");
		int id = sc.nextInt();
		Menu requestedItem = null;
	    for(Menu m:lm) {
	    	if(m.getId() == id) {
	    		requestedItem = m;
	    	}
	    }
	    if(requestedItem == null) return null;
	    Order exist  = null;
	    for(Order ord:lo) {
	    	if(ord.getM().getId() == requestedItem.getId() && ord.getC().getId() == this.getId()) {
	    		exist = ord;
	    	}
	    }
	    if(exist != null) {
	    	exist.setQuantity(exist.getQuantity() + 1);
	    	return null;
	    }
	    Order o = new Order(requestedItem, this);
	    return o;
	}
	
	
}
