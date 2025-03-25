package h3;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		int max = 0;
		String n = "";
		for (String word : words) {
			if (max < word.length()) {
				max = word.length();

				n = word;
			}
		}
		System.out.println(n);
	}

}
