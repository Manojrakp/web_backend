package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = {"com.example.demo", "com.web.ang"})
@Slf4j
public class WebAng1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebAng1Application.class, args);
	}

}
