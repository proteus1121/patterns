package org.proteus1121.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Library implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}