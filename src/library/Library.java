package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	String name;
	List<Book> lb;
	List<Student> ls;
	List<Assigned> la;

	public Library(String name) {
		this.name = name;
		lb = new ArrayList<>();
		ls = new ArrayList<>();
		la = new ArrayList<>();
	}

	public void displayAllAssignedBooks() {
		for (Assigned a : la) {
			System.out.println(a);
		}
	}

	public void displayAllBooks() {
		for (Book b : lb) {
			System.out.println(b);
		}
	}

	public void displayAllStudents() {
		for (Student s : ls) {
			System.out.println(s);
		}
	}

	public void addBook(Book b) {
		lb.add(b);
		System.out.println("Book was added");
	}

	public void addStudent(Student s) {
		ls.add(s);
		System.out.println("Student was added");
	}

	public String getName() {
		return name;
	}

	public List<Book> getLb() {
		return lb;
	}

	public List<Student> getLs() {
		return ls;
	}

	public List<Assigned> getLa() {
		return la;
	}

	public void assignBook(Book b, Student s) {
		if (b.getQuantity() <= b.getIssuedQuantity()) {
			System.out.println("Book was unavailable");
			return;
		}
		Assigned assign = new Assigned(b, s);
		s.assignBook(b);
		b.setIssuedQuantity(b.getIssuedQuantity() + 1);
		la.add(assign);
		System.out.println("Book was assigned successfully");
//		if (b.getQuantity() == 0) {
//			System.out.println("Book was unavailable");
//			return;
//		}
//		Assigned assign = new Assigned(b, s);
//		s.assignBook(b);
//		b.setQuantity(b.getQuantity() - 1);
//		la.add(assign);
//		System.out.println("Book was assigned successfully");
	}

	public void captureReturnedBook(Book b, Student s) {
		Assigned book = null;
		for (Assigned a : la) {
			if (a.getB().getBid() == b.getBid() && a.getS().getSid() == s.getSid()) {
				book = a;
				break;
			}
		}
		if (book != null) {
			b.setIssuedQuantity(b.getIssuedQuantity() + 1);
			la.remove(book);
			System.out.println("Book returned successfully");
		}
	}

}
