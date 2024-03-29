package com.narendra.microservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceTwoApplication.class, args);
	}

}
