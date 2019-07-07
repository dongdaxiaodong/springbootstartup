package com.dongdaxiaodong.springbootstartup.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }
}
