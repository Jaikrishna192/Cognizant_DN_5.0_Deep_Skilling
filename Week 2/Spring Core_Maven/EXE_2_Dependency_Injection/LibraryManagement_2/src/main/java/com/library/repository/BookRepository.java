package com.library.repository;

public class BookRepository {

    public void getAllBooks() {
    	System.out.println("BookRepository bean injected into BookService successfully.");
        System.out.println("Fetching all books from the library...");
    }
}