package com.chen.project.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 消息队列发送
 *
 * @author 陈智颖
 * @date 2018-11-16 下午2:21
 **/
@RestController
public class MessageController {

    @Resource
    private Processor processor;

    @GetMapping("/sendMessage")
    public void sendMessage(){
        String message = "now"+ new Date();
        processor.output().send(MessageBuilder.withPayload(message).build());
    }
}
