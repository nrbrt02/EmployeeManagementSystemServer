/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Group;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class GroupDao {

    public Group addGroup(Group groupObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(groupObj);
            tr.commit();
            ss.close();
            return groupObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Group editGroup(Group postionObj) {
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

    public Group deleteGroup(Group groupObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(groupObj);
            tr.commit();
            ss.close();
            return groupObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public List<Group> searchByName(String name) {
//        try {
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            List<Group> postions = ss.createCriteria(Group.class).add(Restrictions.eq("name", name)).list();
//            return postions;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public List<Group> allGroups() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Group> Group = ss.createCriteria(Group.class).list();
            return Group;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
