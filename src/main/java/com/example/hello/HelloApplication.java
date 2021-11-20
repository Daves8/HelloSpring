package com.example.hello;

import com.example.hello.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("name1", "decs1", 3, true));
		products.add(new Product("name2", "decs2", 0, false));
		products.add(new Product("name3", "decs3", 2, true));
		return args -> {
			products.forEach(System.out::println);
		};
	}

}