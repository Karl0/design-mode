package com.karl.test.dao;

import com.karl.test.entity.User;
import com.karl.test.template.JDBCTemplate;
import com.karl.test.template.RowMapper;

import javax.sql.DataSource;
import java.lang.reflect.AnnotatedType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private JDBCTemplate JdbcTemplate = new JDBCTemplate(null);

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
