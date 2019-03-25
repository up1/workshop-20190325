package com.example.java_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.out;

@SpringBootApplication
public class JavaFrameworkApplication {

	public static void main(String... args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(JavaFrameworkApplication.class, args);

		String[] beans = context.getBeanDefinitionNames();
		for (String bean: beans) {
			out.println(bean);
		}
		out.printf("Size: %d", beans.length);
	}

}
