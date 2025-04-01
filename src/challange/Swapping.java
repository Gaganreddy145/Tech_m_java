package challange;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gagan";
		String temp = "";
		for(int i=1;i<s.length();i+=2) {
			temp += s.charAt(i);
			temp += s.charAt(i-1);
		}
		if(s.length()%2!=0) {
			temp += s.charAt(s.length()-1);
		}
		System.out.println(temp);
	}

}
