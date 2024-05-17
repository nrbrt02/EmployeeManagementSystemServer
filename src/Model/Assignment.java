/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
public class Assignment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Integer assignemntId;
    private String name;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    private String status;
    private String description;
    private String priority;
    
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project theProject;
    
    @ManyToMany
    @JoinTable(
            name = "assigned_group",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Group> assignedTo;

    public Assignment() {
    }

    public Assignment(Integer assignemntId, String name, Date startDate, Date endDate, String status, String description, String priority, Project theProject, Set<Group> assignedTo) {
        this.assignemntId = assignemntId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.description = description;
        this.priority = priority;
        this.theProject = theProject;
        this.assignedTo = assignedTo;
    }





    public Integer getAssignemntId() {
        return assignemntId;
    }

    public void setAssignemntId(Integer assignemntId) {
        this.assignemntId = assignemntId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Project getTheProject() {
        return theProject;
    }

    public void setTheProject(Project theProject) {
        this.theProject = theProject;
    }


    public Set<Group> getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Set<Group> assignedTo) {
        this.assignedTo = assignedTo;
    }


    
    
}
