package com.fhm.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Hello {
    @Value("${person.name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hell0" + name;
    }

    @RequestMapping("/success")
    public String succ(Map<String,Object> maps){
        maps.put("hello","<h1>你好</h1>");
        maps.put("users", Arrays.asList("zhang","wang","li"));
        return "/succ";
    }
}
