/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
@Table(
        name = "employee",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Email", "phone"})
)
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String names;
    private String Address;
    private String Email;
    private String phone;
    @OneToOne
    @JoinColumn(name = "department_id")
    private Department theDepartment;
    @OneToOne
    @JoinColumn(name = "position_id")
    private Position thePosition;
    @OneToMany(mappedBy = "emp_attendances")
    private List<Attendance> attendances;
    @OneToMany(mappedBy = "managed_groups")
    private List<Group> managedGroups;
    @OneToMany(mappedBy = "emp_leave_list")
    private List<Leave> leaveList;
    
    public Employee() {
    }

    public Employee(Integer employeeId, String names, String Address, String Email, String phone, Department theDepartment, Position thePosition, List<Attendance> attendances, List<Group> managedGroups, List<Leave> leaveList) {
        this.employeeId = employeeId;
        this.names = names;
        this.Address = Address;
        this.Email = Email;
        this.phone = phone;
        this.theDepartment = theDepartment;
        this.thePosition = thePosition;
        this.attendances = attendances;
        this.managedGroups = managedGroups;
        this.leaveList = leaveList;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(Department theDepartment) {
        this.theDepartment = theDepartment;
    }

    public Position getThePosition() {
        return thePosition;
    }

    public void setThePosition(Position thePosition) {
        this.thePosition = thePosition;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public List<Group> getManagedGroups() {
        return managedGroups;
    }

    public void setManagedGroups(List<Group> managedGroups) {
        this.managedGroups = managedGroups;
    }

    public List<Leave> getLeaveList() {
        return leaveList;
    }

    public void setLeaveList(List<Leave> leaveList) {
        this.leaveList = leaveList;
    }

    
    
    
}
