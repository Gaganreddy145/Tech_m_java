package MultiThreading;

public class ThreadExample extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t1 = new ThreadExample();
		t1.start();
		t1.setName("1st");
		ThreadExample t2 = new ThreadExample();
		t2.start();
		t2.setName("2nd");
	}

}
