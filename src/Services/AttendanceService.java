/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Attendance;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ZIPTECH LTD
 */
public interface AttendanceService extends Remote{
    Attendance saveAttendance(Attendance attendanceObj) throws RemoteException;
    Attendance editAttendance(Attendance attendanceObj) throws RemoteException;
    List<Attendance> allAttendances() throws RemoteException;
    List<Attendance> searchAttByEmployeeAndDate(Attendance attendanceObj) throws RemoteException;
}
