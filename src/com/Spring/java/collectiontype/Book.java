package com.Spring.java.collectiontype;

import java.util.List;

public class Book {
    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookList=" + bookList +
                '}';
    }
}
