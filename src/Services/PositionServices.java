/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Position;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface PositionServices extends Remote{
    Position savePosition(Position positionObj) throws RemoteException;
    Position updatePosition(Position positionObj) throws RemoteException;
    Position deletePosition(Position positionObj) throws RemoteException;
    List<Position> searchPosition(String name) throws RemoteException;
    List<Position> allPositions() throws RemoteException;
}
