package com.dreamtale.instant.message.api.entity.user.param;

import java.io.Serializable;

public class UserLoginParam implements Serializable{

    private String userName;

    private String userPassword;

    private String loginIp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
