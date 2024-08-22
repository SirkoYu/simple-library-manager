package main.com.java.service;

import main.com.java.Main;
import main.com.java.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    public final List<Book> books = new ArrayList<>();
    private final String separator = "----------\n";

    public void registerBook(){
        Optional<Book> book = BookService.buildBook();
        book.ifPresent(books::add);
    }
    public void removeBook(){
        System.out.print("Enter ISBN: ");
        String isbn = Main.SCANNER.nextLine();
        books.remove(new Book(isbn));
    }
    public void findBooks(){
        System.out.print("Enter keyword");
        String keyword = Main.SCANNER.nextLine();
        List<Book> foundBooks = this.books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase())).toList();
        System.out.println("Found books:");
        for(Book book: foundBooks){
            System.out.print(separator + book + separator);
        }
    }
    public void showAllBooks(){
        System.out.println("All books:");
        for(Book book: this.books){
            System.out.print(separator + book + separator);
        }
    }
}
