package com.example.SDPDemo;

import com.example.SDPDemo.models.Book;
import com.example.SDPDemo.repositories.BookRepository;
import com.example.SDPDemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@SpringBootApplication
public class SdpDemoApplication {



	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookService bookService;


	public static void main(String[] args) {
		SpringApplication.run(SdpDemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {

			//INSERT
			repository.save(new Book("W pustyni"));
			repository.save(new Book("W puszczy"));
			repository.save(new Book("W Koszalinie"));

			//SELECT ALL
			List<Book> library = repository.findAll();
			library.forEach(System.out::println);

			//SELECT BY ID
			System.out.println(repository.findById(1L));

			//DELETE
			repository.deleteById(1L);

			//SELECT ALL
			library = repository.findAll();
			library.forEach(System.out::println);

		};
	}
	
}
