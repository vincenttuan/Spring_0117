package com.web.mvc.controller;

import com.web.mvc.beans.Student;
import com.web.mvc.validate.StudentValidator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    public static List<Student> students = new ArrayList<>();
    
    @Autowired
    private StudentValidator validator;
    
    @RequestMapping("/input")
    public String input(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("students", students);
        model.addAttribute("action", "add");
        return "student";
    }
    
    @RequestMapping("/add")
    public String add(@ModelAttribute Student student, BindingResult result, Model model) {
        validator.validate(student, result);
        if(result.hasErrors()) {
            model.addAttribute("students", students);
            model.addAttribute("action", "add");
            return "student";
        }
        int id = 1;
        if(students.size() != 0) {
            id = students.stream().mapToInt(s -> s.getId()).max().getAsInt() + 1;
        }
        student.setId(id);
        students.add(student);
        return "redirect:./input";
    }
    
    @RequestMapping("/update")
    public String update(@ModelAttribute Student student) {
        Student o_student = students.stream().filter(s -> s.getId() == student.getId()).findFirst().get();
        o_student.setName(student.getName());
        o_student.setAge(student.getAge());
        return "redirect:./input";
    }
    
    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id") Integer id, Model model) {
        Student student = students.stream().filter(s -> s.getId() == id).findFirst().get();
        model.addAttribute("student", student);
        model.addAttribute("students", students);
        model.addAttribute("action", "update");
        return "student";
    }
    
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        Student student = students.stream().filter(s -> s.getId() == id).findFirst().get();
        students.remove(student);
        return "redirect:../input";
    }
    
    
}
