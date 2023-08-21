package com.portal.salesportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.portal.salesportal")
public class SalesportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesportalApplication.class, args);
	}

}
