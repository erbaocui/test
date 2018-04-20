package com.Final.model;

import java.util.List;

/**
 * Created by tb on 2016/10/30.
 */
public class MyUser {

    private String id; // 主键 用户名
    private String loginName;
    private String name;
    private String password; // 密码
    private List<MyRole> roles; // 用户拥有的角色集合 以逗号隔开

    public MyUser() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyRole> getRoles() {
        return roles;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setRoles(List<MyRole> roles) {
        this.roles = roles;
    }


}
