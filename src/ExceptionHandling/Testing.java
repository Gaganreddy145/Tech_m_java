package ExceptionHandling;

public class Testing {
	public static void error() {
		int a = 100/0;
		System.out.println("Hi " + a);
	}
	public static void just() {
		error();
		System.out.println("I am in just");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			just();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
