package DAODTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBConn.createConnection();
			EmployeeFeatures eobj = new EmployeeFeatures(conn);
//			Employee e = new Employee(2, "Mahesh", "engineer");
//			int count = eobj.addEmployee(e);
//			if (count > 0) {
//				System.out.println("Employee inserted");
//
//			} else {
//				System.out.println("employee failed to insert");
//			}
//			int m=eobj.deleteEmployee(1);
//			if(m>0) {
//				System.out.println("Employee Deleted");
//			}else {
//				System.out.println("Employee failed to delete");
//			}

			int update = eobj.updateEmployee(2);
			if (update > 0) {
				System.out.println("Employee Updated");
			} else {
				System.out.println("Employee failed to Update");
			}

			List<Employee> le = eobj.getAll();
			for (Employee e1 : le) {
				System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getDesignation());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.close();
		}

	}

}