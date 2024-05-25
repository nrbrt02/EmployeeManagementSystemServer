/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Leave;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface LeaveServices extends Remote{
    Leave saveLeave(Leave LeaveObj) throws RemoteException;
    Leave updateLeave(Leave LeaveObj) throws RemoteException;
    Leave deleteLeave(Leave LeaveObj) throws RemoteException;
    List<Leave> allLeaves() throws RemoteException;
}
