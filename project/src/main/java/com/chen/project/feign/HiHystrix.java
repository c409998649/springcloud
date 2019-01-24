package com.chen.project.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 * @author 陈智颖
 * @date 2018-11-14 下午1:48
 **/
@Component
public class HiHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hi,"+name+",sorry.error!";
    }
}