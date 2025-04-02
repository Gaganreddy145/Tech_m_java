package ExceptionHandling;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(1000.0, 101, "Gagan");
		Scanner sc = new Scanner(System.in);
		char choice = 'n';
		do {
			System.out.print("1) Deposit 2)WithDraw 3)Balance: ");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.print("Enter the amount to be deposited: ");
				b1.deposit(sc.nextDouble());
				break;
			case 2:
				System.out.print("Enter the amount to be withdrawed: ");
				try {
					b1.withdraw(sc.nextDouble());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.print("Your Balance: ");
				System.out.print(b1.getBalance());
				break;
			}
			sc.nextLine();
			System.out.print("Do you want to continue [Y or y]: ");
			choice = sc.nextLine().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("Terminated Successfully");
	}

}
