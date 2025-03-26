package aggregation;

public class Customer {
	int id;
	String name, style;

	public Customer(int id, String name, String style) {
		this.id = id;
		this.name = name;
		this.style = style;
	}

	public void displayInfo() {
		System.out.println("Id: " + id + " Name: " + name + " Style: " + style);
	}

}
