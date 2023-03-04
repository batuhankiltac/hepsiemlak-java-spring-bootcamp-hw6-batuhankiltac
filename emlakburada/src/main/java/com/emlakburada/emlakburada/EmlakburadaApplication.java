package com.emlakburada.emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmlakburadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakburadaApplication.class, args);
	}

}