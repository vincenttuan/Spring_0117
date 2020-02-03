package com.web.mvc;

import com.web.mvc.beans.User;
import java.util.List;
import java.util.Vector;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositiry {
    private static List<User> users = new Vector<>();
    
    public User getUser(Integer id) {
        return null;
    }
    
    public List<User> queryUsers() {
        return users;
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public void updateUser(User user) {
        
    }
    
    public void removeUser(User user) {
        users.remove(user);
    }
    
}
