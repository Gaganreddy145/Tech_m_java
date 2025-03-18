package homework;

import java.util.*;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		long sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum += fact(r);
			n /= 10;
		}

		if (sum == temp)
			System.out.println("Strong");
		else
			System.out.println("Weak");
	}

	public static long fact(long digit) {
		long pro = 1;
		if (digit == 0)
			return 1;
		for (int i = 1; i <= digit; i++)
			pro *= i;
		return pro;
	}

}