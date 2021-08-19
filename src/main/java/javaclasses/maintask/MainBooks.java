package javaclasses.maintask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainBooks {
    public static String[][] readInput(File file) {
        final int numberOfFields = 8; //number of books' characteristics
        try {
            Scanner scanner = new Scanner(file);
            int numberOfBooks = scanner.nextInt();
            scanner.nextLine();
            String[][] array = new String[numberOfBooks][numberOfFields];
            for (int i = 0; i < numberOfBooks; i++) {
                String line = scanner.nextLine();
                String[] splitedLine = line.split("; ");
                System.arraycopy(splitedLine, 0, array[i], 0, numberOfFields);
            }
            return array;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Bad bad day");
    }

    public static void main(String[] args) {
        File file = new File("data/books.txt");
        String[][] array = readInput(file);
        Book[] booksArray = new Book[array.length];
        for (int i = 0; i < array.length; i++) {
            Book book = Book.CreateBookFromStringArgs(array[i]);
            booksArray[i] = book;
        }
        BooksCollection booksCollection = new BooksCollection(booksArray);
        System.out.println("Books written by the chosen author:");
        booksCollection.filterByAuthor("J. K. Rowling");
        System.out.println("Books published by the chosen publishing house:");
        booksCollection.filterByPublishingHouse("Bloomsbury");
        System.out.println("Books published after the chosen year (incl.):");
        booksCollection.filterByPublishedAfterYear(2015);
    }
}
