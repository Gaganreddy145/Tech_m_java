package bank.classes;

import java.util.Scanner;

public class Bank {
	private int accId;
	private double balance;
	private String name;

	public Bank(int accId, double balance, String name) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.name = name;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Money Deposited and ur balance is " + balance);
	}

	public void withDraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Money has been debited and ur balance is " + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void infoOfAccount() {
		System.out.println(accId + " " + name + " " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank[] arr = new Bank[3];
		for (int i = 0; i < 3; i++) {
			int id = sc.nextInt();
			double balance = sc.nextDouble();
			sc.nextLine();
			String name = sc.nextLine();
			arr[i] = new Bank(id, balance, name);
		}
		int id = sc.nextInt();
		Bank search = null;
		;
		for (int i = 0; i < 3; i++) {
			if (arr[i].getAccId() == id) {
				search = arr[i];
				break;
			}
		}
		//https://github.com/Gaganreddy145/Tech_m_java
		
		while (true) {
			System.out.println("Enter ur choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				search.getBalance();
				break;
			case 2:
				double amount = sc.nextDouble();
				search.withDraw(amount);
				break;
			case 3:
				double amounts = sc.nextDouble();
				search.deposit(amounts);
				break;
			case 4:
				search.infoOfAccount();
				break;
			}
			System.out.println("Do u want to continue: ");
			char ch = sc.next().charAt(0);
			if (ch != 'y' && ch != 'Y') {
				break;
			}
		}

	}

}
