package com.example.books.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 书籍表
 */
public class Book {
    private Integer bookId;//书籍id
    private String bookName;//书籍名
    private Integer bookNum;//书籍编号
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bookAddDate;//书籍添加日期
    private Integer bookToal;//书籍总数
    private Integer bookRewainder;//书籍余数

    public Book() {
    }

    public Book( String bookName, int bookNum, Date bookAddDate, int bookToal, int bookRewainder) {
        this.bookName = bookName;
        this.bookNum = bookNum;
        this.bookAddDate = bookAddDate;
        this.bookToal = bookToal;
        this.bookRewainder = bookRewainder;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public Date getBookAddDate() {
        return bookAddDate;
    }

    public void setBookAddDate(Date bookAddDate) {
        this.bookAddDate = bookAddDate;
    }

    public int getBookToal() {
        return bookToal;
    }

    public void setBookToal(int bookToal) {
        this.bookToal = bookToal;
    }

    public int getBookRewainder() {
        return bookRewainder;
    }

    public void setBookRewainder(int bookRewainder) {
        this.bookRewainder = bookRewainder;
    }
}
