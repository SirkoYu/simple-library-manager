package main.com.java;

import main.com.java.componend.Authenticator;
import main.com.java.componend.Menu;
import main.com.java.componend.ResourcesRegister;
import main.com.java.service.Library;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final ResourcesRegister register = new ResourcesRegister();

    public static Library library;

    static {
        try {
            library = register.readLibrary();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Can`t read binary file.");
        }
    }

    private static final Menu myMenu = new Menu();
    public static void main(String[] args) {
        if(Authenticator.auth()) {
            System.out.println("Login completed. ");
            System.out.println(myMenu.mainMenu);
            try {
                myMenu.getOperation();
            } catch (IOException e) {
                System.out.println("Output error.");
            }
        }
    }
}