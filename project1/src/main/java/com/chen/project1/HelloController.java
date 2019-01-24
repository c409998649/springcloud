package com.chen.project1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈智颖
 * @date 2018-11-13 下午8:39
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello "+name+"，this is first messge";
    }
}
