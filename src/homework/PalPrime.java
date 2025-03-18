package homework;

import java.util.Scanner;

public class PalPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (isPal(n) && isPrime(n))
			System.out.println("PalPrime");
		else
			System.out.println("Not a PalPrime");

	}

	public static boolean isPal(int n) {
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return temp == rev;
	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count++;
		return count == 2;
	}

}