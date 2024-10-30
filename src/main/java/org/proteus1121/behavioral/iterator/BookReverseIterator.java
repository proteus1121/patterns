package org.proteus1121.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

class BookReverseIterator implements Iterator<Book> {
    private List<Book> books;
    private int position;

    public BookReverseIterator(List<Book> books) {
        this.books = books;
        this.position = books.size() - 1;  // Начинаем с последнего элемента
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Book next() {
        return books.get(position--);  // Возвращаем текущий элемент и сдвигаем позицию влево
    }
}