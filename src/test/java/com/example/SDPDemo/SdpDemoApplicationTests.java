package com.example.SDPDemo;

import com.example.SDPDemo.models.Book;
import com.example.SDPDemo.repositories.BookRepository;
import com.example.SDPDemo.services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class SdpDemoApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookService bookService;


	public void test(){

	}


}
