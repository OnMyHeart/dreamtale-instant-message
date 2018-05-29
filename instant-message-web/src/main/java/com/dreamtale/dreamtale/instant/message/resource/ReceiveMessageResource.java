package com.dreamtale.dreamtale.instant.message.resource;

import com.dreamtale.dreamtale.instant.message.entity.message.MessageEntity;
import com.dreamtale.dreamtale.instant.message.service.ReceiveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receive/message")
public class ReceiveMessageResource {

    @Autowired
    ReceiveMessageService receiveMessageService;

    @RequestMapping("/receive")
    public String receiveMessage(MessageEntity messageEntity){
        return receiveMessageService.getMessage(messageEntity);
    }

    @RequestMapping("/push")
    public String pushMessage(){
        return "你是不是傻！";
    }



}
