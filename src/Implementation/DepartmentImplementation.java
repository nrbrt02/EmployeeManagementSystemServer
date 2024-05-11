/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.DepartmentDao;
import Model.Department;
import Services.DepartmentServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class DepartmentImplementation extends UnicastRemoteObject implements DepartmentServices{
    DepartmentDao dao = new DepartmentDao();

    public DepartmentImplementation() throws RemoteException{
    }

    @Override
    public Department saveDepartment(Department departmentObj) throws RemoteException {
        return dao.addDepartment(departmentObj);
    }

    @Override
    public Department updateDepartment(Department departmentObj) throws RemoteException {
        return dao.editDepartment(departmentObj);
    }

    @Override
    public Department deleteDepartment(Department departmentObj) throws RemoteException {
        return dao.deleteDepartment(departmentObj);
    }

    @Override
    public List<Department> allDepartments() throws RemoteException {
        return dao.allDepartments();
    }
    
    
    
}
