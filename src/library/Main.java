package library;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb = new Library("Central Library");
		lb.addBook(new Book(1, "After life", "Tao", 10));
		lb.addBook(new Book(2, "Among us", "Tao", 1));
		lb.displayAllBooks();
		Student s1 = new Student(1, "Gagan", "CSE");
		Student s2 = new Student(2, "Reddy", "IT");
		lb.addStudent(s1);
		lb.addStudent(s2);
		lb.displayAllStudents();
		Book requestedBook = s1.borrowBook(lb.getLb(), 2);
		if (requestedBook == null) {
			System.out.println("No such book");
		} else {
			lb.assignBook(requestedBook, s1);
		}
		lb.displayAllAssignedBooks();
//		lb.displayAllBooks();
		s1.displayBorrowedBooks();
		List<Assigned> laByStudentName = lb.searchByStudentNameInIssuedBooks("gaga");
		if (laByStudentName.size() == 0) {
			System.out.println("No books issued for the student");
		} else {
			for (Assigned a : laByStudentName) {
				System.out.println(a);
			}
		}
		Book returnedBook = s1.returnBook(2);
		if (returnedBook == null) {
			System.out.println("No such book");
		} else {
			lb.captureReturnedBook(returnedBook, s1);
		}
		lb.displayAllBooks();
		

	}

}
