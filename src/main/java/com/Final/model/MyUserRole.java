package com.Final.model;

/**
 * Created by tb on 2016/10/29.
 */
public class MyUserRole {

    private String id;
    private String userId;
    private String roleId;

    public MyUserRole() {
    }

    public MyUserRole(String id, String userId,String roleId) {

        this.id = id;
        this.userId =  userId;
        this.roleId=roleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
