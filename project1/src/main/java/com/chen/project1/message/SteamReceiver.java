package com.chen.project1.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author 陈智颖
 * @date 2018-11-16 下午2:30
 **/
@Component
@EnableBinding(Processor.class)
@Slf4j
public class SteamReceiver {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public String processor(String message){
        log.info("message-project1:"+message);
        return "已经接收";
    }
}
