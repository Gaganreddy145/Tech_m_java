package h3;

import java.util.Scanner;

public class DirectReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String[] words = sen.split(" ");
		String s = "";
		for (String word : words) {
			s = word + s;
			s = " " + s;
		}
		System.out.println(s);
	}

}
