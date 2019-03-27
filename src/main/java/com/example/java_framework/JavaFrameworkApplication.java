package com.example.java_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.out;

@SpringBootApplication
public class JavaFrameworkApplication{
//		extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(JavaFrameworkApplication.class);
//	}

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
