package collections;

import java.util.*;

public class Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> la = new ArrayList<>();
		List<Integer> la1 = new ArrayList<>();
		List<Integer> la2 = new ArrayList<>();
		for (int i = 1; i <= 6; i++)
			la.add(i);
		int mid = la.size() / 2;
		for (int i = 0; i < mid; i++) {
			la1.add(la.get(i));
		}
		for (int i = mid; i < la.size(); i++) {
			la2.add(la.get(i));
		}
		System.out.println("First part: " + la1);
		System.out.println("Second part: " + la2
				);
	}

}
