package main.com.java;

import main.com.java.componend.Authenticator;
import main.com.java.model.Book;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        if(Authenticator.auth()) {
            System.out.println("Login completed. ");

            Book book = new Book("Title" , "Author", 1234556664L, Short.parseShort("2001"));
            System.out.println(book);
        }
        else System.out.println("Application has been blocked.");
    }
}