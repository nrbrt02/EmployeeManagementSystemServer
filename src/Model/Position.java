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
        name = "position",
        uniqueConstraints = @UniqueConstraint(columnNames = {"title"})
)
public class Position implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Integer positionId;
    private String title;
    private String description;
}
