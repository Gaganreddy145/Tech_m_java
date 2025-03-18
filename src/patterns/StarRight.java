package patterns;

import java.util.Scanner;

public class StarRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print("  ");
			for (int k = 1; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}

	}
}
