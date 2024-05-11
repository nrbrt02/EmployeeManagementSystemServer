/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Department;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author ZIPTECH LTD
 */
public interface DepartmentServices extends Remote{
    Department saveDepartment(Department departmentObj) throws RemoteException;
    Department updateDepartment(Department departmentObj) throws RemoteException;
    Department deleteDepartment(Department departmentObj) throws RemoteException;
    List<Department> allDepartments() throws RemoteException;
}
