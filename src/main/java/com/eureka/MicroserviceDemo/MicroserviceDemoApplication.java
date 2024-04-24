package com.eureka.MicroserviceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Spring Cloud’s @EnableEurekaServer to set up a registry with which other applications can communicate.
// @EnableEurekaServer marks your module as a Eureka Server — basically tying your microservices together
@EnableEurekaServer
public class MicroserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

}
