package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.api.entity.message.MessageEntity;
import com.dreamtale.instant.message.web.service.ReceiveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/receive/message")
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
