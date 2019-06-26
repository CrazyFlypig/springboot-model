package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * user_info实体
 *
 * @author cc
 * @date 2019-05-27 13:15:15
 */

public class UserInfo {

    @Id
    private String id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password_p")
    private String passwordP;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswordP(String passwordP) {
        this.passwordP = passwordP;
    }

    public String getId() {

        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordP() {
        return passwordP;
    }
}
