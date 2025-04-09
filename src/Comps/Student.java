package Comps;

import java.util.*;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(101, "Gagan"));
		ls.add(new Student(102, "Abhi"));
		Collections.sort(ls, new ComparatorExample());
		System.out.println(ls);
	}

}
