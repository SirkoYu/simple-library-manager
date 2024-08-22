package main.com.java;

import main.com.java.componend.ResourcesRegister;
import main.com.java.service.Library;

import java.io.IOException;

public class LibraryCreation {
    static ResourcesRegister resourcesRegister = new ResourcesRegister();

    public static void main(String[] args) {
        Library library = new Library();
        try {
            resourcesRegister.writeLibrary(library);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
