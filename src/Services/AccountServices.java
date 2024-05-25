/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Account;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface AccountServices extends Remote {

    Account saveAccount(Account accountObj) throws RemoteException;

    Account searchAccount(Account accountObj) throws RemoteException;

    List<Account> searchAccountEmail(Account accountObj) throws RemoteException;

    Account updateAccount(Account accountObj) throws RemoteException;

    Account deleteAccount(Account accountObj) throws RemoteException;

    List<Account> allAccounts() throws RemoteException;

    List<Account> loginAccount(Account accountObj) throws RemoteException;

    Integer ChangePassword(Account accountObj) throws RemoteException;
}
