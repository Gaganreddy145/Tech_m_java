package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the id:");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter the name:");
		String name = br.readLine();
		System.out.print("Enter price:");
		double price = Double.parseDouble(br.readLine());
		System.out.print("Choice:");
		char ch = br.readLine().charAt(0);
		boolean b = Boolean.parseBoolean(br.readLine());
		System.out.println(id + " " + name + " " + price + " " + ch + " " + b);
	}

}
