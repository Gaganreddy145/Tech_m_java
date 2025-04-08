package ResProj;
import java.util.*;

public class Order {
	Menu m;
	Customer c;
	int quantity = 1;
	public Order(Menu m, Customer c) {
		super();
		this.m = m;
		this.c = c;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [m=" + m + ", c=" + c + ", quantity=" + quantity + "]";
	}

	public Menu getM() {
		return m;
	}
	public void setM(Menu m) {
		this.m = m;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
	
}
