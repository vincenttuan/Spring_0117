package com.web.spring.study.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Family {
    
    private String name;
    private Set<String> members;
    private List<String> hobbies;
    private Map<String, Integer> height;

    public Family(String name) {
        this.name = name;
    }

    public Family(Set<String> members) {
        this.members = members;
    }

    public Family(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Family(Map<String, Integer> height) {
        this.height = height;
    }

    public Family(String name, Set<String> members, List<String> hobbies, Map<String, Integer> height) {
        this.name = name;
        this.members = members;
        this.hobbies = hobbies;
        this.height = height;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getMembers() {
        return members;
    }

    public void setMembers(Set<String> members) {
        this.members = members;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Integer> getHeight() {
        return height;
    }

    public void setHeight(Map<String, Integer> height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Family{" + "name=" + name + ", members=" + members + ", hobbies=" + hobbies + ", height=" + height + '}';
    }
    
    
}
