package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
        mv.setViewName("/WEB-INF/jsp/hello.jsp");
        return mv;
    }
    
}
