package main.com.java.model;

public class Book {
    private String title;
    private String author;
    private long isbn;

    private short year;

    public Book(String title, String author, long isbn, short year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return STR."Tittle: \{this.title}\nAuthor: \{this.author}\nISBN: \{this.isbn}\nYear: \{this.year}";
    }
}
