package com.tapsi.tapsodia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class TapsodiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TapsodiaApplication.class, args);
	}

}
