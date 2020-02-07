package com.web.mvc.controller;

import com.web.mvc.beans.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    static List<Student> students = new ArrayList<>();
    
    @GetMapping("/input")
    public String input(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student";
    }
    
    @PostMapping("/add")
    public String add(@ModelAttribute Student student) {
        int id = 1;
        if(students.size() != 0) {
            id = students.stream().mapToInt(s -> s.getId()).max().getAsInt() + 1;
        }
        student.setId(id);
        students.add(student);
        System.out.println(students);
        return "redirect:./input";
    }
    
    
}
