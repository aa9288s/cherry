package com.cherry.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cherry.cloud")
public class CherryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryAppApplication.class, args);
	}
}
