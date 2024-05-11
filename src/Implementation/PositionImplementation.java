/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.PositionDao;
import Model.Position;
import java.rmi.server.UnicastRemoteObject;
import Services.PositionServices;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class PositionImplementation extends UnicastRemoteObject implements PositionServices{
    PositionDao dao = new PositionDao();

    public PositionImplementation()throws RemoteException{
    }

    @Override
    public Position savePosition(Position positionObj) throws RemoteException {
        return dao.addPostion(positionObj);
    }

    @Override
    public Position updatePosition(Position positionObj) throws RemoteException {
        return dao.editPostion(positionObj);
    }

    @Override
    public Position deletePosition(Position positionObj) throws RemoteException {
        return dao.deletePostion(positionObj);
    }

    @Override
    public List<Position> searchPosition(String name) throws RemoteException {
        return dao.searchByName(name);
    }

    @Override
    public List<Position> allPositions() throws RemoteException {
        return dao.allPositions();
    }

    @Override
    public Position allAsObject() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
