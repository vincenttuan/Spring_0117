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
    
    public Map<String, String> getUser(String username) {
        return users.stream().filter(u -> u.get("username").equals(username)).findFirst().get();
    }
    
    public void updatePassword(String username, String newPassword) {
        Map<String, String> user = getUser(username);
        if(user == null) return;
        user.replace("password", newPassword);
    }
    
    public void deleteUser(String username) {
        Map<String, String> user = getUser(username);
        if(user == null) return;
        users.remove(user);
    }

    @Override
    public String toString() {
        return "UserDAO{" + "users=" + users + '}';
    }
    
    
}
