package library;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int sid;
	private String sname, department;
	List<Book> borrowedBooks;

	public Student(int sid, String sname, String department) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.department = department;
		borrowedBooks = new ArrayList<>();
	}

	public void displayBorrowedBooks() {
		for (Book b : borrowedBooks) {
			System.out.println(b);
		}
	}
	
	public Book returnBook(int bid) {
		Book returnBook = null;
		for(Book b:borrowedBooks) {
			if(b.getBid() == bid) {
				returnBook = b;
				break;
			}
		}
		if(returnBook != null) {
//			returnBook.setQuantity(returnBook.getQuantity() + 1);
			borrowedBooks.remove(returnBook);
		}
		return returnBook;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", department=" + department + ", borrowedBooks="
				+ borrowedBooks + "]";
	}

	public Book borrowBook(List<Book> lb, int id) {
		Book requestedBook = null;
		for (Book b : lb) {
			if (b.getBid() == id) {
				requestedBook = b;
				break;
			}
		}
		if(requestedBook != null) {
			for(Book b:borrowedBooks) {
				if(b.getBid() == id) {
					return null;
				}
			}
		}
		return requestedBook;
	}

	public void assignBook(Book b) {
		borrowedBooks.add(b);
	}

}
