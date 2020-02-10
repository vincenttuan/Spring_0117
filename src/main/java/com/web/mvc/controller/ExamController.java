package com.web.mvc.controller;

import com.web.mvc.beans.Exam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/exam")
public class ExamController {
    static List<Exam> exams = new ArrayList<>();
    
    static Map<String, String> exam_option = new LinkedHashMap<>();
    static {
        exam_option.put("1z0-808", "OCPJP I (1z0-808)");
        exam_option.put("1z0-809", "OCPJP II (1z0-809)");
        exam_option.put("1z0-900", "OCPJAD (1z0-900)");
    }
    
    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("exam_option", exam_option);
        model.addAttribute("exam", new Exam());
        model.addAttribute("exams", exams);
        model.addAttribute("action", "add");
        return "exam";
    }
    
    @RequestMapping(value="/add")
    public String save(@ModelAttribute Exam exam, Model model) {
        exams.add(exam);
        return "redirect:./input";
    }
    
}
