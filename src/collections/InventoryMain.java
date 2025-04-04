package collections;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory in = new Inventory();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter id: ");
			int id = sc.nextInt();
			System.out.print("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
			in.addProduct(new Product(id, name));

		}
		in.displayInventory();
		System.out.println("Is Low Inventory: " + in.checkForLowInventory());
		in.removeProduct(102);
		in.displayInventory();
	}

}
