package com.fhm.springboot.config;

import com.fhm.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
配置类，用来配置bean，约等于beans。xml
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@bean给容器添加组件");
        return new HelloService();

    }
}
