package h3;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter the target value: ");
		int target = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.print(arr[i] + " + " + arr[j] + " ");
				}
			}
		}
	}

}
