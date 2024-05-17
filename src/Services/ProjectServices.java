/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Project;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface ProjectServices extends Remote{
    Project saveProject(Project ProjectObj) throws RemoteException;
    Project updateProject(Project ProjectObj) throws RemoteException;
    Project deleteProject(Project ProjectObj) throws RemoteException;
    Project searchById(Project projectObj) throws RemoteException;
    List<Project> searchByName(String name) throws RemoteException;
    List<Project> allProjects() throws RemoteException;
}
