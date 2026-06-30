package com.employeeapp.Main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employeeapp.Config.AppConfig;
import com.employeeapp.DAO.EmployeeDAO;
import com.employeeapp.Models.Employee;

public class DBOperations {
	public static ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
	
	public static EmployeeDAO employeeDAO=applicationContext.getBean(EmployeeDAO.class);
		
	public static Scanner input=new Scanner(System.in);
	
	public static void insertEmployee()
	{
		System.out.println("Enter Name:");
		
		String name=input.nextLine();
		
		System.out.println("Enter Designation:");
		String designation=input.nextLine();
		
		System.out.println("Enter Age:");
		int age=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter City:");
		String city=input.nextLine();
		
		employeeDAO.addEmployee(new Employee(0,name,designation,age,city));
	
		
	}
	
	public static void updateEmployee()
	{
		System.out.println("Enter Id:");
		int id=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter Name:");
		String name=input.nextLine();
		
		System.out.println("Enter Designation:");
		String designation=input.nextLine();
		
		System.out.println("Enter Age:");
		int age=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter City:");
		String city=input.nextLine();
		
		employeeDAO.updateEmployee(new Employee(id,name,designation,age,city));
	
		
	}
	
	public static void deleteEmployee() {
		System.out.println("Enter Id:");
		int id=input.nextInt();
		input.nextLine();
		
		employeeDAO.deleteEmployee(id);
	}
	
	public static void displayEmployees() {
		System.out.println(employeeDAO.fetchEmployees());
	}
	public static void main(String[] args) {
		int choice;

	    do {

	        System.out.println("\n******** EMPLOYEE RECORD SYSTEM ********");
	        System.out.println("1. Insert Employee");
	        System.out.println("2. Update Employee");
	        System.out.println("3. Delete Employee");
	        System.out.println("4. View All Employees");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");

	        choice = input.nextInt();
	        input.nextLine();

	        switch (choice) {
	        case 1:
	            insertEmployee();
	            break;
	        case 2:
	            updateEmployee();
	            break;
	        case 3:
	            deleteEmployee();
	            break;
	        case 4:
	            displayEmployees();
	            break;
	        case 5:
	            System.out.println("Thank You... Exiting Application.");
	            break;
	        default:
	            System.out.println("Invalid Choice! Please try again.");
	        }
	    } while (choice != 5);

	    input.close();
	    ((AnnotationConfigApplicationContext) applicationContext).close();
	
		
		
	}
}
