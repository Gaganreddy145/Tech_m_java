package DAODTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFeatures implements EmployeeTransfer {
	Connection conn;

	public EmployeeFeatures(Connection conn) {
		this.conn = conn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		int i = 0;
		String s = "insert into employee(id,empname,designation) values(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(s);
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getDesignation());
			i = ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return i;
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		int i = 0;
		String d = "Delete from employee where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(d);
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> le = new ArrayList<>();
		String s = "select * from employee";
		try {
			PreparedStatement ps = conn.prepareStatement(s);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				le.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return le;
	}

	@Override
	public int updateEmployee(int id) {
		// TODO Auto-generated method stub
		int temp = 0;
		String s = "update employee set designation = ? where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(s);
			ps.setString(1, "Manager");
			ps.setInt(2, id);
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}

}