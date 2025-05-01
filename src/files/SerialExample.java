package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class SerialExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:\\serial.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fout);
		Student s = new Student(101, "Reddy");
		oo.writeObject(s);
		oo.close();
		System.out.println("😁");
	}

}
