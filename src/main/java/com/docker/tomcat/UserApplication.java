package com.docker.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(UserApplication.class);
		application.run(args);
	}
}
