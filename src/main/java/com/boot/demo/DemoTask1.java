package com.boot.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class DemoTask1 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("WLCOME TO CLOUD TASK "+args[1]);
		
	}
	
	@BeforeTask
	public void taskStartHandler(TaskExecution execution)
	{
		System.out.println("Task Started for execution id --> "+execution.getExecutionId());
	}
	
	@AfterTask
	public void taskEndHandler(TaskExecution execution)
	{
		System.out.println("Task Ended for execution id -->  "+execution.getExecutionId());
	}

	@FailedTask
	public void taskFailureHandler(TaskExecution execution)
	{
		System.out.println("Task Failed for execution id -->  "+execution.getExecutionId());
	}
	
}