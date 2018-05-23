package com.yws.springbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yws.springbatis.dao")
public class SpringbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatisApplication.class, args);
	}
}
