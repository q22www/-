package com.example.books.servlet;


import com.example.books.entity.User;
import com.example.books.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class UserServlet {
    public void dopost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("templates/html");

        request.setCharacterEncoding("UTF-8");

        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String userGender = request.getParameter("userGender");
        String userNumber = request.getParameter("userNumber");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String registeredDate = request.getParameter("registeredDate");
        String lastLoginDate = request.getParameter("lastLoginDate");

        User user = new User();

        user.setUserId(Integer.parseInt(userId));
        user.setUserName(userName);
        user.setUserGender(userGender);
        user.setUserNumber(userNumber);
        user.setAccount(account);
        user.setPassword(password);
        user.setRegisteredDate(Date.valueOf(registeredDate));
        user.setLastLoginDate(Date.valueOf(lastLoginDate));

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.registered(user);
    }
}
