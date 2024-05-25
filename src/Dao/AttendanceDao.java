/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Attendance;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class AttendanceDao {

    public Attendance addAttendance(Attendance attendanceObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(attendanceObj);
            tr.commit();
            ss.close();
            return attendanceObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Attendance editAttendance(Attendance attendanceObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(attendanceObj);
            tr.commit();
            ss.close();
            return attendanceObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> searchAttByEmployeeAndDate(Attendance attObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> theClass = ss.createCriteria(Attendance.class)
                    .add(Restrictions.eq("theEmployee", attObj.getTheEmployee()))
                    .add(Restrictions.eq("date", attObj.getDate()))
                    .list();

            ss.close();
            return theClass;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Attendance> allAttendances() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Attendance> Attendance = ss.createCriteria(Attendance.class).list();
            return Attendance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
