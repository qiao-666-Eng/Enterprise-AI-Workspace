package com.enterprise_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.enterprise_ai.mapper")
public class EnterpriseAiApplication {

	public static void main(String[] args) {

		SpringApplication.run(EnterpriseAiApplication.class, args);
	}

}
