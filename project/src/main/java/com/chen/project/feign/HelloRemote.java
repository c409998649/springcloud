package com.chen.project.feign;

import com.chen.project.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 微服务通信
 *
 * @author 陈智颖
 * @date 2018-11-13 下午8:42
 **/
@Component
@FeignClient(name= "project1",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
