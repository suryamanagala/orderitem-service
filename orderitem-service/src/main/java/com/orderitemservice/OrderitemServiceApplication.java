package com.orderitemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderitemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderitemServiceApplication.class, args);
	}

}
