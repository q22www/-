package com.example.books;

import com.example.books.entity.User;
import com.example.books.repository.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DaoTest {
    ApplicationContext context = null;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:spring/application-dao.xml");
    }

    @Test
    public void testSelectByPrimaryKey(){
        UserMapper userMapper = (UserMapper) context.getBean();
        User user = userMapper.selectByUseraccountAndPassword();
        System.out.println(user.getPassword());
    }

}
