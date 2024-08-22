package main.com.java.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private long isbn;

    private short year;
    public Book(){

    }

    public Book(String title, String author, String isbn, String  year) {
        this.title = title;
        this.author = author;
        this.isbn = Long.parseLong(isbn);
        this.year = Short.parseShort(year);
    }

    public Book(String isbn){
        this.isbn = Long.parseLong(isbn);
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

    public void setIsbn(String isbn) {
        this.isbn = Long.parseLong(isbn);
    }

    public short getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = Short.parseShort(year);
    }

    @Override
    public String toString() {
        return STR."Tittle: \{this.title}\nAuthor: \{this.author}\nISBN: \{this.isbn}\nYear: \{this.year}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
