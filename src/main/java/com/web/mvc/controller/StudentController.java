package com.web.mvc.controller;

import com.web.mvc.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/input")
    public String input(Model model) {
        Student student = new Student();
//        student.setId(1);
//        student.setName("Vincent");
//        student.setAge(20);
        model.addAttribute("student", student);
        return "student";
    }
}
