package Services;

import Model.Employee;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ZIPTECH LTD
 */
public interface EmployeeService extends Remote {

    Employee saveEmployee(Employee empolyeeObj) throws RemoteException;

    Employee searchEmployee(Employee empolyeeObj) throws RemoteException;

    Employee updateEmployee(Employee empolyeeObj) throws RemoteException;

    Employee deleteEmployee(Employee empolyeeObj) throws RemoteException;

    List<Employee> allEmployees() throws RemoteException;

    List<Employee> searchByEmail(String email) throws RemoteException;

}
