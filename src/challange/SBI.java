package challange;

public class SBI extends Bank{
	int intRate = 7;
	public int getInterestRate() {
		int res = (int) ((amount * intRate) / 100);
		return res;
	}
}
