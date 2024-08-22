package main.com.java.componend;

import main.com.java.Main;

public class Menu {
    public String mainMenu = "1 - Add new book.\n"
            + "2 - Remove exiting book.\n"
            + "3 - Find books by title.\n"
            + "4 - Show all books.";

    public void getOperation(){
        System.out.print("Enter operation: ");
        int userInput = Integer.parseInt(Main.SCANNER.nextLine());
        switch (userInput){
            case 1 -> Main.library.registerBook();
            case 2 -> Main.library.removeBook();
            case 3 -> Main.library.findBooks();
            case 4 -> Main.library.showAllBooks();
        }
    }
}
