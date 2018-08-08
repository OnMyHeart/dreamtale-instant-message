package com.dreamtale.instant.message.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.dreamtale"})
@ServletComponentScan(value = {"com.dreamtale"})
@MapperScan(value = {"com.dreamtale.instant.message.api.mapper"})
public class InstantMsgWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstantMsgWebApplication.class, args);
	}

}
