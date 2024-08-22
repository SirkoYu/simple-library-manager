package main.com.java.componend;

import main.com.java.Main;
import main.com.java.service.Library;

import java.io.*;

public class ResourcesRegister {
    public Library readLibrary() throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream("src/main/com/java/resources/library.bin");
        ObjectInputStream ois = new ObjectInputStream(fos);

        Library library = (Library) ois.readObject();
        ois.close();
        return  library;
    }
    public void writeLibrary() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/com/java/resources/library.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Main.library);

        oos.close();
    }
    public void writeLibrary(Library library) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/com/java/resources/library.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(library);

        oos.close();
    }
}
