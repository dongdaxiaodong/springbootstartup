package com.dongdaxiaodong.springbootstartup.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
