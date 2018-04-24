package com.karl.test.main;

import com.alibaba.druid.pool.DruidDataSource;
import com.karl.test.dao.UserDao;
import com.karl.test.template.JDBCTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TemplateTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<?> userList = userDao.queryAll("user");
        System.out.println(userList);
    }

}
