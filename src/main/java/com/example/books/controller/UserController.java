package com.example.books.controller;

import com.example.books.entity.User;
import com.example.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

@Controller
@RestController
//@RequestMapping()
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String toSignIn(){
        return "signIn";
    }

    @RequestMapping(value = "/signIn", method = {RequestMethod.POST})
    public String Registered(User user, Model model){
//        try{
//            if (user == null)
//                return null;
//        }catch (NullPointerException e){
//            userService.registered(user);
//        }
        userService.registered(user);

        model.addAttribute("user", user);
        return "home";
    }

    @RequestMapping(value = "/signIn/login")
    public String login(User user, Model model){

        userService.getUser(user);
        model.addAttribute("user", user);
        return "login";
    }
}
