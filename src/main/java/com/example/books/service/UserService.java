package com.example.books.service;

import com.example.books.entity.User;

import java.util.List;

public interface UserService {

    void registered(User user);//添加用户信息
    User getByUseraccountAndPassword(User user);//查询用户的账号和密码
    User getUser(User user);//查询某一个用户的所有信息
    List<User> getAllUser();//查询所有用户的所有信息
    Integer delIn(Integer userid);//删除某一个用户的所有信息
}
