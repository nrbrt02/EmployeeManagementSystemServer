/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author ZIPTECH LTD
 */
@Entity
public class Account implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String password;
    @Column(columnDefinition = "boolean default 1")
    private boolean status;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee theEmployee;

    public Account() {
    }

    public Account(Integer accountId, String password, boolean status, Employee theEmployee) {
        this.accountId = accountId;
        this.password = password;
        this.status = status;
        this.theEmployee = theEmployee;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }
    
    
}
