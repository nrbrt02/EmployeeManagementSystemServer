/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Project;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class ProjectDao {

    public Project addProject(Project projectObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(projectObj);
            tr.commit();
            ss.close();
            return projectObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Project editProject(Project projectObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(projectObj);
            tr.commit();
            ss.close();
            return projectObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Project deleteProject(Project projectObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(projectObj);
            tr.commit();
            ss.close();
            return projectObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Project> searchByName(String name) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Project> projects = ss.createCriteria(Project.class).add(Restrictions.eq("name", name)).list();
            return projects;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Project searchById(Project pjObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Project thePj = (Project) ss.get(Project.class, pjObj.getProjectId());
            ss.close();
            return thePj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Project> allProjects() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Project> projects = ss.createCriteria(Project.class).list();
            ss.close();
            return projects;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
