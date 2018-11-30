package com.wuqio.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @RequestMapping("/restSlow")
    public Object rest() throws InterruptedException {
        Thread.sleep(15000);
        return "rest";
    }

    @RequestMapping("/restFast")
    public String rest2(){
        return "rest2";
    }
}
