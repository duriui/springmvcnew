package com.dr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    // 会被视图解析器解析到，加上视图前缀/WEB-INF/templates/和视图后缀.html，组成/WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
