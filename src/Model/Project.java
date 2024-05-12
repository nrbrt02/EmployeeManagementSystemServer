/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
@Table(
        name = "project",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private String status;
    
    @ManyToMany(mappedBy = "assignments")
    private Set<Assignment> assignements;
}
