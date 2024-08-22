package main.com.java.componend;

import main.com.java.Main;

public class Authenticator {
    private static final String password = "library";

    public static boolean auth(){

        for (int i = 1; i <= 3; i++) {
            System.out.print(i == 1 ? "Enter password: " : STR."(Attempt \{i}) Enter password: ");
            String input = Main.SCANNER.nextLine();
            if (input.equals(password)) return true;
        }
        return false;
    }
}
