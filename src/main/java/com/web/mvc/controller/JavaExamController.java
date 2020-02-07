package com.web.mvc.controller;

import com.web.mvc.beans.JavaExam;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/javaexam")
public class JavaExamController {
    
    public static List<JavaExam> javaExams = new ArrayList<>();
    
    @RequestMapping("/input")
    public String input(Model model) {
        JavaExam javaExam = new JavaExam();
        model.addAttribute("javaExam", javaExam);
        model.addAttribute("javaExams", javaExams);
        model.addAttribute("students", StudentController.students);
        model.addAttribute("action", "add");
        return "javaexam";
    }
    
    
    
    
}
