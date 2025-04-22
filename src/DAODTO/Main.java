package DAODTO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBConn.createConnection();
			Employee e = new Employee(2, "Mahesh", "engineer");
			EmployeeFeatures eobj = new EmployeeFeatures(conn);
			int count = eobj.addEmployee(e);
			if(count > 0) {
				System.out.println("Employee inserted");
				
			}else {
				System.out.println("employee failed to insert");
			}
//			int m=eobj.deleteEmployee(1);
//			if(m>0) {
//				System.out.println("Employee Deleted");
//			}else {
//				System.out.println("Employee failed to delete");
//			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}