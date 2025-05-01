package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookFeatures {
	Connection conn;

	public BookFeatures(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public int addBook(Book b) {
		String s = "insert into book(bname,author,quantity,issuedQuantity) values(?,?,?,?)";
		int i = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(s);
			ps.setString(1, b.getBname());
			ps.setString(2, b.getAuthor());
			ps.setInt(3, b.getQuantity());
			ps.setInt(4, b.getIssuedQuantity());
			i = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public List<Book> getAllBooks(){
		String s = "select * from book";
		List<Book> lbs = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(s);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Book b = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
				lbs.add(b);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lbs;
	}
	
}
