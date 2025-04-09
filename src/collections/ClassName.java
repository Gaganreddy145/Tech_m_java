package collections;

import java.util.ArrayList;
import java.util.List;

public class ClassName {
	private String subName;
	private Teacher t;
	private List<Student> ls;

	public ClassName(String subName, Teacher t) {
		super();
		this.subName = subName;
		this.t = t;
		ls = new ArrayList<>();
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	public List<Student> getLs() {
		return ls;
	}

	public void setLs(List<Student> ls) {
		this.ls = ls;
	}

	public void addStudent(Student s) {
		ls.add(s);
	}

	public void removeStudent(Student s) {
		ls.remove(s);
	}

	@Override
	public String toString() {
		return "ClassName [subName=" + subName + ", t=" + t + ", ls=" + ls + "]";
	}

}
