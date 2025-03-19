package h2;

import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		int first = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = first;
		for (int a : arr)
			System.out.print(a + " ");
	}

}