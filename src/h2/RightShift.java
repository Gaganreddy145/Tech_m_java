package h2;

import java.util.Scanner;

public class RightShift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		int last = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--)
			arr[i + 1] = arr[i];
		arr[0] = last;
		for (int a : arr)
			System.out.print(a + " ");
	}
}