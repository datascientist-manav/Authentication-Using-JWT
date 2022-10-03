package com.teamb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class Authenticationservice {

	public static void main(String [] args) {
		SpringApplication.run(Authenticationservice.class, args);
	}
}
