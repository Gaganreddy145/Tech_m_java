package DAODTO;

import java.util.List;

public interface EmployeeTransfer {
	public int addEmployee(Employee e);

	public int deleteEmployee(int id);

	public List<Employee> getAll();

	public int updateEmployee(int id);
}