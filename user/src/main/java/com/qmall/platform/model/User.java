package com.qmall.platform.model;

import java.io.Serializable;

/**
 * Created by caoyi on 5/13/15.
 */
public class User implements Serializable {
    private long id;
    private String name;
    private String password;
    private String mobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
