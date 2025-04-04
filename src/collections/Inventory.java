package collections;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products;

	Inventory() {
		products = new ArrayList<>();
	}

	public void addProduct(Product p) {
		products.add(p);
	}

	public void removeProduct(int id) {
		int index = -1;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("No product found with id: " + id);
		} else {
			products.remove(index);

		}
	}

	public boolean checkForLowInventory() {
		return products.size() < 5;
	}

	public void displayInventory() {
		for (Product p : products) {
			System.out.println(p);
		}
	}

}
