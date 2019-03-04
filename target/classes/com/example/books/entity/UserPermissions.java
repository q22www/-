package com.example.books.entity;

/**
 * 用户(角色)权限表
 */
public class UserPermissions {
    private Integer userPermissionsId;//用户权限id



    public UserPermissions() {
    }

    public int getUserPermissionsId() {
        return userPermissionsId;
    }

    public void setUserPermissionsId(int userPermissionsId) {
        this.userPermissionsId = userPermissionsId;
    }
}
