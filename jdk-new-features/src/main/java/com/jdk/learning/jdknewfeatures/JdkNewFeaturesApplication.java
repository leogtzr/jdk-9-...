package com.jdk.learning.jdknewfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdkNewFeaturesApplication {

	public static void main(final String[] args) {
		SpringApplication.run(JdkNewFeaturesApplication.class, args);
		ProcessHandl
		final long pid = ProcessHandle.current().pid();
		System.out.println(String.format("pid: %d", pid));

	}
}
