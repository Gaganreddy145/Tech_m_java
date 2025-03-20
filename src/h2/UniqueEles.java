package h2;

import java.util.Scanner;

public class UniqueEles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int found = 0;
		for (int i = 0; i < n; i++) {
			found = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j] && i != j) {
					found = 1;
				}
			}
			if (found == 0)
				System.out.print(arr[i] + " ");
		}
	}

}
