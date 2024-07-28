package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//для не дефолтных пакетов, т.е. если файлы лежат не в demo
//@SpringBootApplication(scanBasePackages = {"com.example.demo", "com.example.util"})

@SpringBootApplication
public class SecondAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecondAppApplication.class, args);
	}

}
