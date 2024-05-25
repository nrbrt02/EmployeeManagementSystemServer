/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Employee;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class EmployeeDao {

    public Employee addOrUpdateEmployee(Employee employeeDao) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(employeeDao);
            tr.commit();
            ss.close();
            return employeeDao;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee editEmployee(Employee employeeDao) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(employeeDao);
            tr.commit();
            ss.close();
            return employeeDao;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee deleteEmployee(Employee employeeDao) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(employeeDao);
            tr.commit();
            ss.close();
            return employeeDao;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee searchEmployee(Employee empObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Employee theEmp = (Employee) ss.get(Employee.class, empObj.getEmployeeId());
            ss.close();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Employee> allEmployees() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Employee> Employees = ss.createCriteria(Employee.class).list();
            return Employees;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Employee> searchByEmail(String email) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = ss.createCriteria(Employee.class).add(Restrictions.eq("Email", email));
            List<Employee> theEmp = criteria.list();
            return theEmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
