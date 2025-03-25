package h3;

import java.util.Scanner;

public class ConvertToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int sum = 0;
		for (char c : s1.toCharArray()) {
			int ascii = (int) c;
			sum += ascii;
		}
		System.out.println(sum);

	}

}
