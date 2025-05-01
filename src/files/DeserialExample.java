package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

public class DeserialExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("D:\\serial.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student s = (Student) oin.readObject();
		oin.close();
		System.out.println(s);
	}

}
