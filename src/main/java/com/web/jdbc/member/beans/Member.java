package com.web.jdbc.member.beans;

import java.util.Date;

public class Member {
    private Integer id;
    private String username;
    private String password;
    private String email; 
    private Boolean pass;
    private String code;
    private Date passts;
    private Integer priority;
    private Date ts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getPassts() {
        return passts;
    }

    public void setPassts(Date passts) {
        this.passts = passts;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", pass=" + pass + ", code=" + code + ", passts=" + passts + ", priority=" + priority + ", ts=" + ts + '}';
    }
    
    
}
