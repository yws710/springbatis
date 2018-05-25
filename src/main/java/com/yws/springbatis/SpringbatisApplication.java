package com.yws.springbatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatisApplication.class, args);
	}
}
