package com.fhm.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${person.name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hell0" + name;
    }
}
