package com.example.books.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 借书表
 */
public class Library {
    private Integer libraryId;//借书id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date libraryDate;//借书日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date shouldReturnDate;//应还日期

    public Library() {
    }

    public Library( Date libraryDate, Date shouldReturnDate) {
        this.libraryDate = libraryDate;
        this.shouldReturnDate = shouldReturnDate;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public Date getLibraryDate() {
        return libraryDate;
    }

    public void setLibraryDate(Date libraryDate) {
        this.libraryDate = libraryDate;
    }

    public Date getShouldReturnDate() {
        return shouldReturnDate;
    }

    public void setShouldReturnDate(Date shouldReturnDate) {
        this.shouldReturnDate = shouldReturnDate;
    }
}
