package dev.scorpio.spring_boot_async_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootAsyncDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAsyncDemoApplication.class, args);
	}

}
