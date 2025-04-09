package collections;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School("Silver Oaks");
		Teacher t1 = new Teacher(101, "Kineera");
		Teacher t2 = new Teacher(102, "Sneha");
		Teacher t3 = new Teacher(103, "Tao");
		Student s1 = new Student(201, "Gagan");
		Student s2 = new Student(202, "Reddy");
		Student s3 = new Student(203, "Eswar");
		Student s4 = new Student(204, "Basheer");
		ClassName mathsClass = new ClassName("Maths", t1);
		ClassName englishClass = new ClassName("English", t2);
		mathsClass.addStudent(s1);
		mathsClass.addStudent(s2);
		mathsClass.addStudent(s3);
		englishClass.addStudent(s1);
		englishClass.addStudent(s2);
		englishClass.addStudent(s3);
		englishClass.addStudent(s4);
		s.addClassName(mathsClass);
		s.addClassName(englishClass);
		s.addStudent(s1);
		s.addStudent(s2);
		s.addStudent(s3);
		s.addStudent(s4);
		s.addTeacher(t3);
		s.addTeacher(t2);
		s.addTeacher(t1);
		System.out.println(s.getLs());
		s.removeStudent(s2);
		System.out.println(s.getLs());
		System.out.println(s2.hashCode());
//		System.out.println(s);
	}

}
