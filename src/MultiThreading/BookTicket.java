package MultiThreading;

public class BookTicket {
	int availSeats = 3;

	public synchronized void bookSeats(String user) {
		
		if (availSeats > 0) {
			System.out.println(user + " : " + availSeats);
			availSeats -= 1;
		} else {
			System.out.println("House Full " + user + " is unlucky");
		}
		
	}
}
