package h3;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sens = sc.nextLine();
		String[] words = sens.split(" ");
		StringBuilder sn = new StringBuilder();
		for (String word : words) {
			sn.append(reverseWord(word));
			sn.append(" ");
		}
		System.out.println(sn.toString());

	}

	public static String reverseWord(String word) {
		String temp = "";
		for (char ch : word.toCharArray()) {
			temp = ch + temp;
		}
		return temp;
	}

}
