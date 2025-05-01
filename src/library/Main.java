package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
//		Library lb = new Library("Central Library");
//		lb.addBook(new Book(1, "After life", "Tao", 10));
//		lb.addBook(new Book(2, "Among us", "Tao", 1));
//		lb.displayAllBooks();
//		Student s1 = new Student(1, "Gagan", "CSE");
//		Student s2 = new Student(2, "Reddy", "IT");
//		lb.addStudent(s1);
//		lb.addStudent(s2);
//		lb.displayAllStudents();
//		Book requestedBook = s1.borrowBook(lb.getLb(), 2);
//		if (requestedBook == null) {
//			System.out.println("No such book");
//		} else {
//			lb.assignBook(requestedBook, s1);
//		}
//		lb.displayAllAssignedBooks();
//		s1.displayBorrowedBooks();
//		List<Assigned> laByStudentName = lb.searchByStudentNameInIssuedBooks("gaga");
//		if (laByStudentName.size() == 0) {
//			System.out.println("No books issued for the student");
//		} else {
//			for (Assigned a : laByStudentName) {
//				System.out.println(a);
//			}
//		}
//		Book returnedBook = s1.returnBook(2);
//		if (returnedBook == null) {
//			System.out.println("No such book");
//		} else {
//			lb.captureReturnedBook(returnedBook, s1);
//		}
//		lb.displayAllBooks();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		Library lb = new Library("Central Library");
		char ch = 'n';
		Connection conn = null;
		try {
			conn = DBConnection.createConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			System.out.print("1.Add Book 2.Display all books:");
			int choice = Integer.parseInt(bfr.readLine());
			switch (choice) {
			case 1:
				BookFeatures bf = new BookFeatures(conn);
				System.out.print("Enter book name:");
				String bname = bfr.readLine();
				System.out.print("Enter author name:");
				String author = bfr.readLine();
				System.out.print("Enter the quantity:");
				int quantity = Integer.parseInt(bfr.readLine());
				int res = bf.addBook(new Book(0, bname, author, quantity));
				if (res > 0) {
					lb.setLb(bf.getAllBooks());
					System.out.println("Book added successfully");
				} else {
					System.out.println("Failed to add Book");
				}
				break;
			case 2:
				BookFeatures bf2 = new BookFeatures(conn);
				lb.setLb(bf2.getAllBooks());
				lb.displayAllBooks();
			}
			System.out.print("Do u want to continue(y|Y):");
			ch = bfr.readLine().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Bye Bye");
		conn.close();
//		try {
//			Connection conn = DBConnection.createConnection();
//		BookFeatures bf = new BookFeatures(conn);
//			int res = bf.addBook(new Book(1,"Us","AK",10));
//			if(res > 0) {
//				lb.setLb(bf.getAllBooks());
//				System.out.println("Book added successfully");
//			}else {
//				System.out.println("Failed to add Book");
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		lb.displayAllBooks();

	}

}
