package com.example.SDPDemo.models;

import javax.persistence.*;


@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Book(){

    }

    public Book(String name){
        setBook(name);
    }


    public String getBook(){
        return name;
    }

    public void setBook(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    @Override
    public String toString() {return "Book title: " + this.name;}
}