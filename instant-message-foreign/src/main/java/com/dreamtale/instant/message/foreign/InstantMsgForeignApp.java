package com.dreamtale.instant.message.foreign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.dreamtale"})
@ServletComponentScan(value = {"com.dreamtale"})
public class InstantMsgForeignApp {

    public static void main(String[] args){
        SpringApplication.run(InstantMsgForeignApp.class);
    }
}
