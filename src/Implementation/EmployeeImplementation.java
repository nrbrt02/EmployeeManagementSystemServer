/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.EmployeeDao;
import Model.Department;
import Model.Employee;
import Services.DepartmentServices;
import Services.EmployeeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class EmployeeImplementation extends UnicastRemoteObject implements EmployeeService {

    EmployeeDao dao = new EmployeeDao();

    public EmployeeImplementation() throws RemoteException {
    }

    @Override
    public Employee saveEmployee(Employee empolyeeObj) throws RemoteException {
        return dao.addOrUpdateEmployee(empolyeeObj);
    }

    @Override
    public Employee updateEmployee(Employee empolyeeObj) throws RemoteException {
        return dao.editEmployee(empolyeeObj);
    }

    @Override
    public Employee deleteEmployee(Employee empolyeeObj) throws RemoteException {
        return dao.deleteEmployee(empolyeeObj);
    }

    @Override
    public List<Employee> allEmployees() throws RemoteException {
        return dao.allEmployees();
    }

    @Override
    public Employee searchEmployee(Employee empolyeeObj) throws RemoteException {
        return dao.searchEmployee(empolyeeObj);
    }

    @Override
    public List<Employee> searchByEmail(String email) throws RemoteException {
        return dao.searchByEmail(email);
    }

}
