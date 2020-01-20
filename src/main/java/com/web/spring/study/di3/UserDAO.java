package com.web.spring.study.di3;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {
    @Value("#{${users : {{'username': 'admin', 'password': '1234'}, {'username': 'john', 'password': '5678'}}}}")
    private List<Map<String, String>> users;
    
    public List<Map<String, String>> getUsers() {
        return users;
    }

    public void setUsers(List<Map<String, String>> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDAO{" + "users=" + users + '}';
    }
    
    
}
