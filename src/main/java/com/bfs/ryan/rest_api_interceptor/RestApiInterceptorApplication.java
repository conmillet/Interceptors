package com.bfs.ryan.rest_api_interceptor;

import com.bfs.ryan.rest_api_interceptor.model.Emp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiInterceptorApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(RestApiInterceptorApplication.class, args);

	}

}
