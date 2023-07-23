package com.bookTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesIrctcBookTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesIrctcBookTicketApplication.class, args);
		System.out.println("Application Started....");
	}

}
