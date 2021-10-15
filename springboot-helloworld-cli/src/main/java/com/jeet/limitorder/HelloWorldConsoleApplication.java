package com.jeet.limitorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldConsoleApplication implements CommandLineRunner {
	protected Logger logger= LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Running Command Line Runner with args: {}", args.length);
		for (int i = 0; i < args.length; ++i) {
			logger.info("args[{}]: {}", i, args[i]);
		}
	}
}
