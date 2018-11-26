package com.start.springOne;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class SpringOneApplication {

	public static void main(String[] args) {
		log.info("TEST TEST");
		SpringApplication.run(SpringOneApplication.class, args);
	}
}
