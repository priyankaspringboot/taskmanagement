package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.task.controller","com.task.service","com.task.entity","com.task.repository"})
@ComponentScan(basePackages = {"com.task"})
public class TaskmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagementApplication.class, args);
	}

}
