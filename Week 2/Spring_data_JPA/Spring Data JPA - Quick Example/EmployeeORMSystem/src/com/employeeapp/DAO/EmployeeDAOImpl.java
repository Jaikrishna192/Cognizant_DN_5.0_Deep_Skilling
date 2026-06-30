package com.employeeapp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 

import com.employeeapp.Models.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addEmployee(Employee emp) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(emp);
        System.out.println("Employee record added successfully.");
    }

    @Override
    public void updateEmployee(Employee emp) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(emp);
        System.out.println("Employee record updated successfully.");
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee emp = session.get(Employee.class, id);
        if (emp != null) {
            session.remove(emp);
            System.out.println("Employee record removed successfully.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    @Override
    public List<Employee> fetchEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("From Employee", Employee.class).list();
    }
}