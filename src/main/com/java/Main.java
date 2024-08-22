package main.com.java;

import main.com.java.componend.Authenticator;
import main.com.java.model.Book;
import main.com.java.service.Library;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Library library = new Library();
    public static void main(String[] args) {
        if(Authenticator.auth()) {
            System.out.println("Login completed. ");

            Book book = new Book("Title" , "Author", 1234556664L, Short.parseShort("2001"));
            System.out.println(book);

            library.registerBook(book);
            System.out.println(library.findBooks("title"));
            library.removeBook("1234556664");
            System.out.print(library.books.isEmpty() ? "List is empty." : "List is not empty.");
        }
        else System.out.println("Application has been blocked.");
    }
}