package com.boot.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoTask1 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("WLCOME TO CLOUD TASK "+args[1]);
		
	}

}