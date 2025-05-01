package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\example.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "i am learning java streams";
		bout.write(s.getBytes());
		bout.close();
		System.out.println("Completed to write");
	}
}
