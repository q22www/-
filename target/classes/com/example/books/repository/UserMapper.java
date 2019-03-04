package com.example.books.repository;

import com.example.books.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void saveUser(User user);//保存用户信息
    User selectByUseraccountAndPassword(User user);//查询用户的账号和密码
    User selectUser(User user);//查询某个用户的信息(可以根据用户的其他信息也能查询）
    List<User> selectAllUser();//查询Users表所有
    Integer deleUser(Integer userId);//删除用户
}
