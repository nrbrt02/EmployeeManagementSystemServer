/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
@Table(
        name = "department",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Department implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;
    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Employee deptManager; 

    public Department() {
    }

    public Department(Integer departmentId, String name, String description, Employee deptManager) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
        this.deptManager = deptManager;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getDeptManager() {
        return deptManager;
    }

    public void setDeptManager(Employee deptManager) {
        this.deptManager = deptManager;
    }
    
    
}
