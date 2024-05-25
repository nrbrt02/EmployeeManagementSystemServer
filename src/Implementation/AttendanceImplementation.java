/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.AttendanceDao;
import Model.Attendance;
import Services.AttendanceService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public class AttendanceImplementation extends UnicastRemoteObject implements AttendanceService {

    AttendanceDao dao = new AttendanceDao();

    public AttendanceImplementation() throws RemoteException {
    }

    @Override
    public Attendance saveAttendance(Attendance attendanceObj) throws RemoteException {
        return dao.addAttendance(attendanceObj);
    }

    @Override
    public Attendance editAttendance(Attendance attendanceObj) throws RemoteException {
        return dao.editAttendance(attendanceObj);
    }

    @Override
    public List<Attendance> allAttendances() throws RemoteException {
        return dao.allAttendances();
    }

    @Override
    public List<Attendance> searchAttByEmployeeAndDate(Attendance attendanceObj) throws RemoteException {
        return dao.searchAttByEmployeeAndDate(attendanceObj);
    }

}
