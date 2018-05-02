package com.example.myblogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myblogserver.mapper")
public class MyblogserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyblogserverApplication.class, args);
	}
}
