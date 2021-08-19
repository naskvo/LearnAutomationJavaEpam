package javaclasses.maintask;

import java.util.Arrays;
import java.util.StringJoiner;

public class Book {
    private int id;
    private String name;
    private String author;
    private Edition edition;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book(int id, String name, String author, Edition edition) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.edition = edition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("author='" + author + "'")
                .add("edition=" + edition)
                .toString();
    }

    public static Book CreateBookFromStringArgs(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        String author = args[2];
        int yearOfPublishing = Integer.parseInt(args[4]);
        int numberOfPages = Integer.parseInt(args[5]);
        double price = Double.parseDouble(args[6]);
        BindingType bindingType = BindingType.valueOf(args[7].toUpperCase());
        Book book = new Book(id, name, author);
        Edition edition = new Edition(args[3], yearOfPublishing, numberOfPages, price, bindingType);
        book.setEdition(edition);
        return book;
    }
}
