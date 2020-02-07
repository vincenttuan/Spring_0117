package com.web.mvc.controller;

import com.web.mvc.beans.JavaExam;
import com.web.mvc.beans.Student;
import static com.web.mvc.controller.StudentController.students;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    
    @RequestMapping("/add")
    public String add(@ModelAttribute JavaExam javaExam) {
        int id = 1;
        if(javaExams.size() != 0) {
            id = javaExams.stream().mapToInt(s -> s.getId()).max().getAsInt() + 1;
        }
        javaExam.setId(id);
        // 由於方法參數物件 javaExam 只會有 student 的 id
        // 需透過 id + students 找到指定 student 
        // 最後將完整 student 物件設定給 javaExam
        Student student = StudentController.students.stream().filter(s -> s.getId() == javaExam.getStudent().getId()).findFirst().get();
        javaExam.setStudent(student);
        
        javaExams.add(javaExam);
        System.out.println(javaExams);
        return "redirect:./input";
    }
    
    
    
    
}
