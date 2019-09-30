package com.narendra.microservicethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceThreeApplication.class, args);
	}

}
