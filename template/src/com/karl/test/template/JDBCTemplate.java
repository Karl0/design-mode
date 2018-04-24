package com.karl.test.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate {

    private DataSource dataSource;

    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection("", "");
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement ps, Object ... values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            ps.setObject(i + 1, values[i]);
        }
        return ps.executeQuery();
    }

    private void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    private void closePreparedStatement(PreparedStatement ps) throws SQLException {
        ps.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private List<?> parseResult(ResultSet rs, RowMapper rowMapper) throws SQLException {
        List<Object> list = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            list.add(rowMapper.mapRow(rs, rowNum++));
        }
        return list;
    }


    public List<?> excuteQuery(String sql, RowMapper rowMapper, Object ... values){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = this.getConnection();
            ps = this.createPreparedStatement(conn, sql);
            rs = this.executeQuery(ps, values);
            List<?> list = this.parseResult(rs, rowMapper);
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                this.closeResultSet(rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                this.closePreparedStatement(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                this.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
