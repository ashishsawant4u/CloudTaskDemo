package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class CloudTaskDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskDemoApplication.class, args);
	}

}
