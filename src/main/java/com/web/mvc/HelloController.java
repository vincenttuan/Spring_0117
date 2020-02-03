package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi() {
        return "Say Hi";
    }
    
    @RequestMapping("/yes")
    @ResponseBody
    public String sayYes() {
        return "Say Yes";
    }
    
    @RequestMapping("/page")
    public ModelAndView callHelloJspPage() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "John");
        //mv.setViewName("/WEB-INF/jsp/hello.jsp");
        mv.setViewName("hello");
        return mv;
    }
    
    @RequestMapping("/page2")
    public String callHelloJspPage2(Model model) {
        model.addAttribute("name", "Mary");
        return "hello";
    }
    
    /*
    @RequestMapping(value = "路徑")
    ?  匹配 1 個字符  /testPaths? -> /testPathsA
    ?? 匹配 2 個字符  /testPaths?? -> /testPathsAA
    *  匹配任意字符   /testPaths/* -> /testPaths/ABCDEFG...
    *  匹配任意字符   /testPaths/ * /ok -> /testPaths/ttt/ok
    ** 可含有任意多層路徑 /testPaths/** -> /testPaths/aa/bb/cc
    ** 可含有任意多層路徑 /testPaths/ ** /ok -> /testPaths/aa/bb/cc/ok
    */
    @RequestMapping(value = "/testPaths/**")
    public String testPaths(Model model) {
        model.addAttribute("name", "Path");
        return "hello";
    }
    
    @RequestMapping(value = "/testPaths/{name}/{age}") // ../testPaths/John/10
    public String testPaths2(Model model, @PathVariable("name") String name, @PathVariable("age") Integer age) {
        model.addAttribute("name", name + " " + age);
        return "hello";
    }
    
    @RequestMapping(value = "/testParams") // ../testPaths?name=John&age=10
    public String testParams(Model model, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        model.addAttribute("name", name + " " + age);
        return "hello";
    }
    
    
}
