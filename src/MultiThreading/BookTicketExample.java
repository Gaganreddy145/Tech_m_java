package MultiThreading;

public class BookTicketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTicket bt= new BookTicket();
		UserThread u1 = new UserThread(bt, "Gagan");
		UserThread u2 = new UserThread(bt, "Eswar");
		UserThread u3 = new UserThread(bt, "Reddy");
		UserThread u4 = new UserThread(bt, "Tao");
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		try {
			u1.join();
			u2.join();
			u3.join();
			u4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Avail Seats: " + bt.availSeats);
	}

}
