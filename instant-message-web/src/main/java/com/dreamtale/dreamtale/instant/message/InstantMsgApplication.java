package com.dreamtale.dreamtale.instant.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan
@ServletComponentScan
@EnableConfigurationProperties
@EnableWebSecurity
public class InstantMsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstantMsgApplication.class, args);
	}
}
