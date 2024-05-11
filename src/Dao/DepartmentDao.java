/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Department;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class DepartmentDao {

    public Department addDepartment(Department departmentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(departmentObj);
            tr.commit();
            ss.close();
            return departmentObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Department editDepartment(Department postionObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(postionObj);
            tr.commit();
            ss.close();
            return postionObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Department deleteDepartment(Department departmentObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(departmentObj);
            tr.commit();
            ss.close();
            return departmentObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public List<Department> searchByName(String name) {
//        try {
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            List<Department> postions = ss.createCriteria(Department.class).add(Restrictions.eq("name", name)).list();
//            return postions;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public List<Department> allDepartments() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Department> department = ss.createCriteria(Department.class).list();
            return department;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
