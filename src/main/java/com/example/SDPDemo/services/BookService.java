package com.example.SDPDemo.services;


import com.example.SDPDemo.models.Book;
import com.example.SDPDemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> list(){
        return bookRepository.findAll();
    }
}
