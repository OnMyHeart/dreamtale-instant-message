package com.dreamtale.dreamtale.instant.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ServletComponentScan
@EnableConfigurationProperties
public class InstantMsgWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstantMsgWebApplication.class, args);
	}
}
