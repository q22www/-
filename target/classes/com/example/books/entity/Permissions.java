package com.example.books.entity;

/**
 * 权限表
 */
public class Permissions {
    private Integer permissionsId;//权限id
    private String permissionsName;//权限名称

    public Permissions() {
    }

    public Permissions(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    public int getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(int permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }
}
