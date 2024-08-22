package main.com.java.service;

import main.com.java.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public final List<Book> books = new ArrayList<>();

    public void registerBook(Book book){
        books.add(book);
    }
    public void removeBook(String isbn){
        books.remove(new Book(isbn));
    }
    public List<Book> findBooks(String title){
        return this.books.stream().filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())).toList();
    }
}
