package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.neo.hapi.dao")
public class SpringBootShiroApplication {

	public static void main(String[] args) {
		System.err.println("234567890");
		SpringApplication.run(SpringBootShiroApplication.class, args);
	}
}
