package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("D:\\example.txt");
			String s = "hi\nThis is Gagan\tEswar";
			fout.write(s.getBytes());
			System.out.println("Completed");
			fout.close();
			FileInputStream fin = new FileInputStream("D:\\example.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
