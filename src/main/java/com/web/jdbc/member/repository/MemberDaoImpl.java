package com.web.jdbc.member.repository;

import com.web.jdbc.member.beans.Member;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Member> query() {
        String sql = "SELECT * FROM MEMBER";
        List<Member> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Member>(Member.class));
        return list;
    }

    @Override
    public Member getMember(Integer id) {
        String sql = "SELECT * FROM MEMBER WHERE ID = ?";
        Member member = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Member>(Member.class));
        return member;
    }

    @Override
    public String getUsername(String username) {
        String sql = "SELECT USERNAME FROM MEMBER WHERE USERNAME = ?";
        String name = null;
        try {
            name = jdbcTemplate.queryForObject(sql, new Object[]{username}, String.class);
        } catch (Exception e) {
        }
        return name;
    }

    @Override
    public Boolean verifyEmail(String username, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean passEmail(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean save(Member member) {
        String sql = "INSERT INTO MEMBER(USERNAME, PASSWORD, EMAIL, PASS, CODE, PRIORITY) VALUES(?, ?, ?, ?, ?, ?)";
        int rowCount = jdbcTemplate.update(sql, member.getUsername(), member.getPassword(), member.getEmail(), member.getPass(), member.getCode(), member.getPriority());
        return rowCount == 1 ? true : false;
    }

    @Override
    public Boolean update(Member member) {
        String sql = "UPDATE MEMBER SET PASSWORD = ?, EMAIL = ?, PASS = ?, PRIORITY = ? WHERE ID = ?";
        int rowCount = jdbcTemplate.update(sql, member.getPassword(), member.getEmail(), member.getPass(), member.getPriority(), member.getId());
        return rowCount == 1 ? true : false;
    }

    @Override
    public Boolean delete(Integer id) {
        String sql = "DELETE FROM MEMBER WHERE ID = ?";
        int rowCount = jdbcTemplate.update(sql, id);
        return rowCount == 1 ? true : false;
    }
    
}
