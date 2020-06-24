package com.eureka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AutoDiscoveryClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(AutoDiscoveryClient1Application.class, args);
	}

}
