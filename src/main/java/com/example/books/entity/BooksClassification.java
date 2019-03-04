package com.example.books.entity;

/**
 * 书籍分类表
 */
public class BooksClassification {
    private Integer booksClassificationId;//书籍分类id


    public BooksClassification() {
    }

    public BooksClassification(int booksClassificationId) {
        this.booksClassificationId = booksClassificationId;
    }

    public int getBooksClassificationId() {
        return booksClassificationId;
    }

    public void setBooksClassificationId(int booksClassificationId) {
        this.booksClassificationId = booksClassificationId;
    }
}
