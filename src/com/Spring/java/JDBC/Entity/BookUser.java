package com.Spring.java.JDBC.Entity;

public class BookUser {
    private String bookId;
    private String bookName;
    private String bookStatus;

    public BookUser() {
    }

    public BookUser(String bookId, String bookName, String bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                '}';
    }
}
