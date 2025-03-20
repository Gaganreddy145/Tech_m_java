package h3;

import java.util.Scanner;

public class Ovals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (char ch : s.toCharArray()) {
			char lc = Character.toLowerCase(ch);
			if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') {
				System.out.print(lc);
			}
		}
	}

}
