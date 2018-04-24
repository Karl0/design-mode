package com.karl.test.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.karl.test.entity.User;
import com.karl.test.template.JDBCTemplate;
import com.karl.test.template.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private static DruidDataSource dataSource;
    static {
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
        dataSource.setUsername("*****");
        dataSource.setPassword("**********");
    }

    private JDBCTemplate JdbcTemplate = new JDBCTemplate(dataSource);

    public List<?> queryAll(String tableName){
        String sql = "select * from " + tableName;
        List<?> list = JdbcTemplate.excuteQuery(sql, new RowMapper() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                return user;
            }
        }, null);

        return list;
    }

}
