package com.compass.changelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.compass")
public class ChangelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangelogApplication.class, args);
	}

}
