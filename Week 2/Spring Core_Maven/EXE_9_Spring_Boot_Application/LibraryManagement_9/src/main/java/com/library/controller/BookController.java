package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.entity.Book;
import com.library.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    // Get all books
    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

    // Add a book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    // Delete a book
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        repository.deleteById(id);
    }
 // Update an existing book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") int id,
                           @RequestBody Book updatedBook) {

        Book book = repository.findById(id).orElse(null);

        if (book != null) {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            return repository.save(book);
        }

        return null;
    }
}