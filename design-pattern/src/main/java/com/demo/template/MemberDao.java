package com.demo.template;

import com.demo.template.bean.Member;
import com.demo.template.jdbc.JdbcTemplate;
import com.demo.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    private final DataSource dataSource;

    public MemberDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //具体或得连接的方式
    @Override
    protected Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    List<Member> selectAll() throws SQLException {
        String sql = "select * from member;";
        List<Member> list = execute(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs) throws SQLException {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setAge(rs.getInt("age"));
                member.setNickname(rs.getString("nickname"));
                member.setAddr(rs.getString("addr"));

                return member;
            }
        });
        return list;
    }
}
