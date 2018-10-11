package com.belongcompany;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.belongcompany.mapper")
public class Application {
	public static void main(String[] args) throws Exception {
	    SpringApplication.run(Application.class, args);
	  }
}
