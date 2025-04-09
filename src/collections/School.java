package collections;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Student> ls;
	private List<Teacher> lt;
	private List<ClassName> lc;

	public School(String name) {
		super();
		this.name = name;
		ls = new ArrayList<>();
		lt = new ArrayList<>();
		lc = new ArrayList<>();
	}

	public void addTeacher(Teacher t) {
		lt.add(t);
	}

	public void addStudent(Student s) {
		ls.add(s);
	}

	public void addClassName(ClassName c) {
		lc.add(c);
	}

	public void removeTeacher(Teacher t) {
		lt.remove(t);
	}

	public void removeStudent(Student s) {
		ls.remove(s);
	}

	public void removeClassName(ClassName c) {
		lc.remove(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getLs() {
		return ls;
	}

	public void setLs(List<Student> ls) {
		this.ls = ls;
	}

	public List<Teacher> getLt() {
		return lt;
	}

	public void setLt(List<Teacher> lt) {
		this.lt = lt;
	}

	public List<ClassName> getLc() {
		return lc;
	}

	public void setLc(List<ClassName> lc) {
		this.lc = lc;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", ls=" + ls + ", lt=" + lt + ", lc=" + lc + "]";
	}

}
