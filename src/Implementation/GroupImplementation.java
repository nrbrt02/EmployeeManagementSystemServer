/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.GroupDao;
import Model.Department;
import Model.Group;
import Services.DepartmentServices;
import Services.GroupServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class GroupImplementation extends UnicastRemoteObject implements GroupServices{
    GroupDao dao = new GroupDao();

    public GroupImplementation() throws RemoteException{
    }

    @Override
    public Group saveGroup(Group groupObj) throws RemoteException {
        return dao.addGroup(groupObj);
    }

    @Override
    public Group updateGroup(Group groupObj) throws RemoteException {
        return dao.editGroup(groupObj);
    }

    @Override
    public Group deleteGroup(Group groupObj) throws RemoteException {
        return dao.deleteGroup(groupObj);
    }

    @Override
    public List<Group> allGroups() throws RemoteException {
        return dao.allGroups();
    }

    
    
    
    
}
