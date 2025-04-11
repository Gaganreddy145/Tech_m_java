package MultiThreading;

public class UserThread extends Thread{
	BookTicket bt;
	String name;
	public UserThread(BookTicket bt,String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.bt = bt;
	}
	public void run() {
		bt.bookSeats(name);
	}
}
