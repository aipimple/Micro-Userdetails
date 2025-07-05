package com.user.microservices.Micro_Usersdetails.DTO;


import javax.persistence.Column;

public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String name;
    private String managerName;
    private String email;
    private boolean isActive;
    private String sysCreatedBy;
    private String sysCreatedOn;
    private String sysUpdatedOn;
    private String departmentBusinessUnit;


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
}