package com.dosabandi.dosabandi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DosabandiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DosabandiApplication.class, args);
	}

}
