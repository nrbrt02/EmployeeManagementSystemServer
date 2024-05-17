/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
@Table(
        name = "groupss",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Group implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Integer groupId;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee theManager;
    
    public Group() {
    }

    public Group(Integer groupId, String name, String description, Employee theManager) {
        this.groupId = groupId;
        this.name = name;
        this.description = description;
        this.theManager = theManager;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public Employee getTheManager() {
        return theManager;
    }

    public void setTheManager(Employee theManager) {
        this.theManager = theManager;
    }
    
}
