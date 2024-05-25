/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Leave;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class LeaveDao {

    public Leave addLeave(Leave LeaveObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(LeaveObj);
            tr.commit();
            ss.close();
            return LeaveObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Leave editLeave(Leave postionObj) {
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

    public Leave deleteLeave(Leave LeaveObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(LeaveObj);
            tr.commit();
            ss.close();
            return LeaveObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Leave> allLeaves() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Leave> Leave = ss.createCriteria(Leave.class).list();
            return Leave;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
