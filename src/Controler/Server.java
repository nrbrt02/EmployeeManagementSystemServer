/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Implementation.AccountImplementation;
import Implementation.AttendanceImplementation;
import Implementation.DepartmentImplementation;
import Implementation.EmployeeImplementation;
import Implementation.GroupImplementation;
import Implementation.LeaveImplementation;
import Implementation.PositionImplementation;
import Implementation.ProjectImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ZIPTECH LTD
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(8001);
            theRegistry.rebind("position", new PositionImplementation());
            theRegistry.rebind("department", new DepartmentImplementation());
            theRegistry.rebind("employee", new EmployeeImplementation());
            theRegistry.rebind("accounts", new AccountImplementation());
            theRegistry.rebind("project", new ProjectImplementation());
            theRegistry.rebind("group", new GroupImplementation());
            theRegistry.rebind("leave", new LeaveImplementation());
            theRegistry.rebind("attendance", new AttendanceImplementation());
            System.out.println("Server is running on port 8001");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
