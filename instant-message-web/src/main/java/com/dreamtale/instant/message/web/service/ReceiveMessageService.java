//package com.dreamtale.dreamtale.instant.message.service;
//
//import MessageEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ReceiveMessageService {
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    public String getMessage(MessageEntity message){
//        message = new MessageEntity();
//        message.setFromUserCode("xiaobai");
//        message.setToUserCode("dreamtale");
//        message.setMessageStr("你好啊");
//        redisTemplate.opsForValue().set(message.getFromUserCode()+"-"+message.getToUserCode(),message.getMessageStr());
//        System.out.println(redisTemplate.opsForValue().get(message.getFromUserCode()+"-"+message.getToUserCode()));
//        return "200";
//    }
//
//}
