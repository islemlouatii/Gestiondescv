package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.config.FileStorageProperties;
@Configuration
@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})

public class GestiondescvApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestiondescvApplication.class, args);
	}

}
