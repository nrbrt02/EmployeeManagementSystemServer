/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
public class Attendance implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Integer attendanceId;
    private Date date;
    @Column(name = "in_time")
    private Timestamp inTime;
    @Column(name = "out_time")
    private Timestamp outTime;
    @Column(name = "total_time")
    private Duration totalTime;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee theEmployee;

    public Attendance() {
    }

    public Attendance(Integer id, Date date, Timestamp inTime, Timestamp outTime, Duration totalTime, Employee theEmployee) {
        this.attendanceId = id;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.totalTime = totalTime;
        this.theEmployee = theEmployee;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    public Timestamp getOutTime() {
        return outTime;
    }

    public void setOutTime(Timestamp outTime) {
        this.outTime = outTime;
    }

    public Duration getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Duration totalTime) {
        this.totalTime = totalTime;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }
    
    
}
