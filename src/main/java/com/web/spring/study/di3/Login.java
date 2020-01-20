package com.web.spring.study.di3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Login {
    
    @Autowired
    private UserDAO userDAO;
    
    public boolean check(String username, String password) {
        return userDAO.getUsers()
                .stream()
                .anyMatch(u -> u.get("username").equals(username) && u.get("password").equals(password));
    }
}
