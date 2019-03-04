package com.example.books.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;
import java.util.Date;


/**
 * 用户表
 */
public class User {
    private Integer userId;//用户id
    private String userName;//用户名
    private String userGender;//用户性别
    private String userNumber;//电话号码
    private String account;//用户账号
    private String password;//用户密码
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registeredDate;//用户注册日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastLoginDate;//用户上次登录日期
    private Integer lateNumber;//用户逾期次数

    public User() {
    }

    public User(String userName, String userGender, String userNumber, String account, String password, Date registeredDate, Date lastLoginDate, int lateNumber) {
        this.userName = userName;
        this.userGender = userGender;
        this.userNumber = userNumber;
        this.account = account;
        this.password = password;
        this.registeredDate = registeredDate;
        this.lastLoginDate = lastLoginDate;
        this.lateNumber = lateNumber;
    }

    public User(String userName, String userGender, String userNumber, String account, String password, Date registeredDate, Date lastLoginDate) {
        this.userName = userName;
        this.userGender = userGender;
        this.userNumber = userNumber;
        this.account = account;
        this.password = password;
        this.registeredDate = registeredDate;
        this.lastLoginDate = lastLoginDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisteredDate() {
        return Date.from(Instant.now());
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Date getLastLoginDate() {
        return Date.from(Instant.now());
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public int getLateNumber() {
        return 0;
    }

    public void setLateNumber(int lateNumber) {
        this.lateNumber = lateNumber;
    }
}
