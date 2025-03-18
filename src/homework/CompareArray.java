package homework;

import java.util.*;

public class CompareArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int a1[] = new int[n];
		int a2[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + (i + 1) + " element in the first array: ");
			a1[i] = sc.nextInt();
			System.out.print("Enter the " + (i + 1) + " element in the second array: ");
			a2[i] = sc.nextInt();
		}
		sc.close();
		compareEles(a1, a2);
	}

	public static void compareEles(int[] a1, int[] a2) {
		int n = a1.length;
		for (int i = 0; i < n; i++) {
			if (a1[i] == a2[n - i - 1])
				System.out.println("Equal");
			else if (a1[i] > a2[n - i - 1])
				System.out.println("A1 > A2");
			else
				System.out.println("A1 < A2");
		}
	}
}
