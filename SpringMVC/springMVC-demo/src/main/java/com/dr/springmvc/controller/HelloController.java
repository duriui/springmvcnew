package com.dr.springmvc.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ComponentScan("com.dr.springmvc.controller")
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
