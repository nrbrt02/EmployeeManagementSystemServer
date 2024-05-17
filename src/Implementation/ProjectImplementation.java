/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.ProjectDao;
import Model.Project;
import Services.ProjectServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class ProjectImplementation extends UnicastRemoteObject implements ProjectServices{
    ProjectDao dao = new ProjectDao();

    public ProjectImplementation() throws RemoteException{
    }

    @Override
    public Project saveProject(Project ProjectObj) throws RemoteException {
        return dao.addProject(ProjectObj);
    }

    @Override
    public Project updateProject(Project ProjectObj) throws RemoteException {
        return dao.editProject(ProjectObj);
    }

    @Override
    public Project deleteProject(Project ProjectObj) throws RemoteException {
        return dao.deleteProject(ProjectObj);
    }

    @Override
    public List<Project> searchByName(String name) throws RemoteException {
        return dao.searchByName(name);
    }

    @Override
    public List<Project> allProjects() throws RemoteException {
        return dao.allProjects();
    }

    @Override
    public Project searchById(Project projectObj) throws RemoteException {
        return dao.searchById(projectObj);
    }
    
    
    
    
}
