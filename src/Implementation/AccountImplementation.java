/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.AccountsDao;
import Model.Account;
import Services.AccountServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class AccountImplementation extends UnicastRemoteObject implements AccountServices {

    AccountsDao dao = new AccountsDao();

    public AccountImplementation() throws RemoteException {
    }

    @Override
    public Account saveAccount(Account accountObj) throws RemoteException {
        return dao.addAccount(accountObj);
    }

    @Override
    public Account updateAccount(Account accountObj) throws RemoteException {
        return dao.editAccount(accountObj);
    }

    @Override
    public Account deleteAccount(Account accountObj) throws RemoteException {
        return dao.deleteAccount(accountObj);
    }

    @Override
    public List<Account> allAccounts() throws RemoteException {
        return dao.allAccounts();
    }

    @Override
    public Account searchAccount(Account accountObj) throws RemoteException {
        return dao.searchAccount(accountObj);
    }

    @Override
    public List<Account> loginAccount(Account accountObj) throws RemoteException {
        return dao.loginAccount(accountObj);
    }
    
    

}
