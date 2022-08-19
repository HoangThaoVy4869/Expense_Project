/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "user_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserGroup.findAll", query = "SELECT u FROM UserGroup u"),
    @NamedQuery(name = "UserGroup.findById", query = "SELECT u FROM UserGroup u WHERE u.id = :id"),
    @NamedQuery(name = "UserGroup.findByDateTime", query = "SELECT u FROM UserGroup u WHERE u.dateTime = :dateTime"),
    @NamedQuery(name = "UserGroup.findByExpense", query = "SELECT u FROM UserGroup u WHERE u.expense = :expense"),
    @NamedQuery(name = "UserGroup.findByIncome", query = "SELECT u FROM UserGroup u WHERE u.income = :income"),
    @NamedQuery(name = "UserGroup.findByDescription", query = "SELECT u FROM UserGroup u WHERE u.description = :description")})
public class UserGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_time")
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @Column(name = "expense")
    private Long expense;
    @Column(name = "income")
    private Long income;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Team groupId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User userId;

    public UserGroup() {
    }

    public UserGroup(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Long getExpense() {
        return expense;
    }

    public void setExpense(Long expense) {
        this.expense = expense;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Team getGroupId() {
        return groupId;
    }

    public void setGroupId(Team groupId) {
        this.groupId = groupId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserGroup)) {
            return false;
        }
        UserGroup other = (UserGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.htv.nttv.pojo.UserGroup[ id=" + id + " ]";
    }
    
}
