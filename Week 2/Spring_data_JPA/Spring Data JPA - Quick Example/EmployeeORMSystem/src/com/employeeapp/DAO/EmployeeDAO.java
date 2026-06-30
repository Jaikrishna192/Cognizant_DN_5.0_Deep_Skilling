package com.employeeapp.DAO;

import java.util.List;

import com.employeeapp.Models.Employee;

public interface EmployeeDAO {
	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(int id);
	List<Employee> fetchEmployees();
	
}
