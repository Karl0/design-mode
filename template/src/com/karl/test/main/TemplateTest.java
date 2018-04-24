package com.karl.test.main;

import com.karl.test.dao.UserDao;

import java.util.List;

public class TemplateTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<?> userList = userDao.queryAll("user");
        System.out.println(userList);
    }

}
