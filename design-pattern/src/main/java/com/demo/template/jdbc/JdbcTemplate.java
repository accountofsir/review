package com.demo.template.jdbc;

import com.demo.template.bean.Member;
import lombok.NonNull;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {
    public <T> List<T> execute(String sql, RowMapper<T> rowMapper, Object... params) throws SQLException {
        //1.获取连接
        Connection conn = getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        //填充参数
        fillPreparedStatement(pst, params);
        //查询
        pst.execute();
        //处理结果
        ResultSet resultSet = pst.getResultSet();
        //处理结果
        return dealResultSet(rowMapper, resultSet);
    }

    protected <T> List<T> dealResultSet(RowMapper<T> rowMapper, ResultSet resultSet) throws SQLException {
        List<T> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(rowMapper.mapRow(resultSet));
        }
        return list;
    }

    //封装参数
    private void fillPreparedStatement(PreparedStatement pst, Object[] params) throws SQLException {
        if (null == pst || null == params) {
            return;
        }
        int i = 1;
        for (Object param : params) {
            if (param instanceof Integer) {
                pst.setInt(i++, (int) param);
            } else if (param instanceof Long) {
                pst.setLong(i++, (long) param);
            } else if (param instanceof Double) {
                pst.setDouble(i++, (double) param);
            } else if (param instanceof Float) {
                pst.setFloat(i++, (float) param);
            } else if (param instanceof String) {
                pst.setString(i++, (String) param);
            } else {
                pst.setObject(i++, param);
            }
        }
    }
    protected abstract Connection getConnection() throws SQLException;
}
