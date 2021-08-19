package javaclasses.maintask;

import java.util.Arrays;
import java.util.StringJoiner;

public class BooksCollection {
    private Book[] bookList;

    public BooksCollection(Book[] bookList) {
        this.bookList = bookList;
    }

    public BooksCollection() {
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BooksCollection.class.getSimpleName() + "[", "]")
                .add("bookList=" + Arrays.toString(bookList))
                .toString();
    }

    public void filterByAuthor(String author) {
        for (Book book : bookList
        ) {
            if (book.getAuthor().equals(author))
                System.out.println(book.toString());
        }
    }

    public void filterByPublishingHouse(String publisher) {
        for (Book book : bookList
        ) {
            if (book.getEdition().getPublishingHouse().equals(publisher))
                System.out.println(book.toString());
        }
    }

    public void filterByPublishedAfterYear(int year) { //the year is included
        for (Book book : bookList
        ) {
            if (book.getEdition().getYearOfPublishing() >= year)
                System.out.println(book.toString());
        }
    }
}
