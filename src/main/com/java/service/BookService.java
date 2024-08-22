package main.com.java.service;

import main.com.java.Main;
import main.com.java.model.Book;

import java.util.Optional;

public class BookService {
    public static Optional<Book> buildBook(){
        Book book = new Book();
        System.out.println("Adding new Book.");
        System.out.print("Enter book title: ");
        book.setTitle(Main.SCANNER.nextLine());
        System.out.print("Enter book author: ");
        book.setAuthor(Main.SCANNER.nextLine());
        System.out.print("Enter book isbn: ");
        book.setIsbn(Main.SCANNER.nextLine());
        System.out.print("Enter book year: ");
        book.setYear(Main.SCANNER.nextLine());

        return Optional.of(book);
    }
}
