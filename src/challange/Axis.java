package challange;

public class Axis extends Bank {
	int intRate = 9;
	public int getInterestRate() {
		int res = (int) ((amount * intRate) / 100);
		return res;
	}
}
