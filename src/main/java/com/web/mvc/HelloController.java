package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
}
