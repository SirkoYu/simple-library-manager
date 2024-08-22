package main.com.java;

import main.com.java.componend.Authenticator;
import main.com.java.componend.Menu;
import main.com.java.service.Library;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Library library = new Library();
    private static final Menu myMenu = new Menu();
    public static void main(String[] args) {
        if(Authenticator.auth()) {
            System.out.println("Login completed. ");
            System.out.println(myMenu.mainMenu);
            myMenu.getOperation();
        }
    }
}