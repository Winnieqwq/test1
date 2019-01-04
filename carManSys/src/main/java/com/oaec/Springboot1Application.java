package com.oaec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.mybatis.spring.annotation.MapperScan;
@ImportResource("classpath:applicationContext-trans.xml")
@MapperScan(value= {"com.oaec.mapper"})
@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

}

