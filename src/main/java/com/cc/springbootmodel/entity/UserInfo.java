package com.cc.springbootmodel.entity;

import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password_p")
    private String passwordP;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return password_p
     */
    public String getPasswordP() {
        return passwordP;
    }

    /**
     * @param passwordP
     */
    public void setPasswordP(String passwordP) {
        this.passwordP = passwordP == null ? null : passwordP.trim();
    }
}