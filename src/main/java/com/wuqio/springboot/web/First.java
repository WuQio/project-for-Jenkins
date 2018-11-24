package com.wuqio.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class First {

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }

}
