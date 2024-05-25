/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.LeaveDao;
import Model.Leave;
import Services.LeaveServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class LeaveImplementation extends UnicastRemoteObject implements LeaveServices {

    LeaveDao dao = new LeaveDao();

    public LeaveImplementation() throws RemoteException {
    }

    @Override
    public Leave saveLeave(Leave LeaveObj) throws RemoteException {
        return dao.addLeave(LeaveObj);
    }

    @Override
    public Leave updateLeave(Leave LeaveObj) throws RemoteException {
        return dao.editLeave(LeaveObj);
    }

    @Override
    public Leave deleteLeave(Leave LeaveObj) throws RemoteException {
        return dao.deleteLeave(LeaveObj);
    }

    @Override
    public List<Leave> allLeaves() throws RemoteException {
        return dao.allLeaves();
    }

}
