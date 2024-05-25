/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Account;
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
public class AccountsDao {

    public Account addAccount(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.saveOrUpdate(accountObj);
            tr.commit();
            ss.close();
            return accountObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account editAccount(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(accountObj);
            tr.commit();
            ss.close();
            return accountObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account deleteAccount(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(accountObj);
            tr.commit();
            ss.close();
            return accountObj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account searchAccount(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Account account = (Account) ss.get(Account.class, accountObj.getTheEmployee().getEmployeeId());
            return account;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Account> searchAccountEmail(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();

            Criteria criteria = ss.createCriteria(Account.class);
            criteria.add(Restrictions.eq("theEmployee", accountObj.getTheEmployee()));
            List<Account> foundAccount = criteria.list();
            ss.close();
            return foundAccount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Account> allAccounts() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Account> accounts = ss.createCriteria(Account.class).list();
            return accounts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Account> loginAccount(Account accountObj) {

        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = ss.createCriteria(Account.class);
            criteria.add(Restrictions.eq("theEmployee", accountObj.getTheEmployee()));
            criteria.add(Restrictions.eq("password", accountObj.getPassword()));
            List<Account> foundAccount = criteria.list();
            ss.close();
            return foundAccount;
        } catch (Exception e) {
        }
        return null;
    }

    public Integer ChangePassword(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            Query query = (Query) ss.createQuery("UPDATE Account a SET a.password = :password WHERE a.accountId = :id");
            query.setParameter("password", accountObj.getPassword());
            query.setParameter("id", accountObj.getAccountId());

            Integer acc = query.executeUpdate();
            tr.commit();
            ss.close();
            return acc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
