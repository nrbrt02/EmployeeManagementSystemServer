/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Account;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class AccountsDao {

    public Account addAccount(Account accountObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(accountObj);
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
}
