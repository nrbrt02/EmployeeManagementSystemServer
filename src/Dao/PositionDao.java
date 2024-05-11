/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Position;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class PositionDao {

    public Position addPostion(Position postionObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(postionObj);
            tr.commit();
            ss.close();
            return postionObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Position editPostion(Position postionObj) {
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
    
    public Position deletePostion(Position postionObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(postionObj);
            tr.commit();
            ss.close();
            return postionObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Position> searchByName(String name){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Position> postions = ss.createCriteria(Position.class).add(Restrictions.eq("name", name)).list();
            return postions;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
        public List<Position> allPositions(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Position> postions = ss.createCriteria(Position.class).list();
            return postions;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
