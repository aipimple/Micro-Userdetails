package com.user.microservices.Micro_Usersdetails.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column (name = "user_name")
    private String userName;
    @Column(name = "name")
    private String name;
    @Column (name = "manager_name")
    private String managerName;
    @Column(name = "email")
    private String email;
    @Column(name = "active")
    private boolean isActive;
    @Column(name = "sys_created_by")
    private String sysCreatedBy;
    @Column(name = "sys_created_on")
    private String sysCreatedOn;
    @Column(name = "sys_updated_on")
    private String sysUpdatedOn;
    @Column(name = "department_business_unit")
    private String departmentBusinessUnit;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(String sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(String sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public String getDepartmentBusinessUnit() {
        return departmentBusinessUnit;
    }

    public void setDepartmentBusinessUnit(String departmentBusinessUnit) {
        this.departmentBusinessUnit = departmentBusinessUnit;
    }


    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
