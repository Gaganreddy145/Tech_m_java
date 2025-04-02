package ExceptionHandling;

public class BankAccount {
	private double balance;
	private int accNumber;
	private String name;

	public BankAccount(double balance, int accNumber, String name) {
		super();
		this.balance = balance;
		this.accNumber = accNumber;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println(getBalance());
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw(double amount) throws InsufficientAmountException {
		if(amount > 0 && getBalance() >= amount) {
			setBalance(getBalance() - amount);
			System.out.println(getBalance());
			return ;
		}
			throw new InsufficientAmountException("Insufficient Balance!!!");
	}
 }
