package com.web.mvc.repository;

import com.web.mvc.beans.User;
import java.util.List;
import java.util.Vector;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositiry {
    private static List<User> users = new Vector<>();
    
    public User getUser(Integer id) {
        return users.stream().filter(u -> u.getNum().getId() == id).findFirst().get();
    }
    
    public List<User> queryUsers() {
        return users;
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public void updateUser(Integer id, User user) {
        User u = getUser(id);
        if(u != null) {
            u.setName(user.getName());
            u.setAge(user.getAge());
        }
    }
    
    public void removeUser(Integer id) {
        User u = getUser(id);
        if(u != null) {
            users.remove(u);
        }
    }
    
}
