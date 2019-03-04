package com.example.books.service.impl;

import com.example.books.entity.User;
import com.example.books.repository.UserMapper;
import com.example.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void registered(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public User getByUseraccountAndPassword(User user) {
        return userMapper.selectByUseraccountAndPassword(user);
    }

    @Override
    public User getUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public Integer delIn(Integer userid) {
        return userMapper.deleUser(userid);
    }
}
