package library;

import java.time.LocalDate;

public class Assigned {
	private Book b;
	private Student s;
	private LocalDate borrowedDate,returnDate;

	public Assigned(Book b, Student s) {
		this.b = b;
		this.s = s;
		borrowedDate = LocalDate.now();
		returnDate = borrowedDate.plusDays(7);
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public LocalDate getBorrowedDate() {
		return borrowedDate;
	}

	@Override
	public String toString() {
		return "Assigned [b=" + b + ", s=" + s + ", borrowedDate=" + borrowedDate + ", returnDate=" + returnDate + "]";
	}

//	public void setBorrowedDate(LocalDate borrowedDate) {
//		this.borrowedDate = borrowedDate;
//	}
	

}
