package com.chen.project;

import com.chen.project.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 陈智颖
 * @date 2018-11-14 上午10:37
 **/
@RestController
@RefreshScope
public class  HelloController {

    @Value("${foo}")
    private String foo;

    @Resource
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloRemote.hello(name);
    }

    @RequestMapping("/hello1")
    public String hello1(){
        return foo;
    }
}
