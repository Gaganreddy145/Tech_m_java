package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fwr = new FileWriter("D:\\example.txt");
			BufferedWriter bwr = new BufferedWriter(fwr);
			bwr.write("Tech mahindra java course");
			bwr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
