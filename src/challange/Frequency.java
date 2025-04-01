package challange;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple";
		int[] a = new int[26];
		for (char ch : s.toCharArray()) {
			a[ch - 'a']++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				char ch = (char) (i + 97);
				System.out.println(ch + " " + a[i]);
			}
		}
	}

}
