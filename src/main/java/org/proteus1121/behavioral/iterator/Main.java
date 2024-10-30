package org.proteus1121.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("To Kill a Mockingbird"));

        System.out.println("Iterating over books in the library:");
        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }
}