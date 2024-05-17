package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository){
		return args -> {
			//add some data
			repository.save(new Book(null, "Spring Boot: Up and Running", 328, "Mark Heckler"));
			repository.save(new Book(null, "Friends, Lovers, and the Big Terrible Thing", 272, "Matthew Perry"));
			repository.save(new Book(null, "Bogyo es Baboca", 48, "Bartos Erika"));
		};
	}
}
