package main.com.java;

import main.com.java.componend.Authenticator;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        if(Authenticator.auth()) System.out.println("Login completed. ");
        else System.out.println("Application has been blocked.");
    }
}