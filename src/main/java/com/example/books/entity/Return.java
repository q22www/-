package com.example.books.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 还书表
 */
public class Return {
    private Integer returnId;//还书id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;//还书日期
    private Integer lateTime;//逾期时间
    private Integer fineAmount;//罚款金额

    public Return(Date returnDate, int lateTime, int fineAmount) {
        this.returnDate = returnDate;
        this.lateTime = lateTime;
        this.fineAmount = fineAmount;
    }

    public Return() {
    }

    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getLateTime() {
        return lateTime;
    }

    public void setLateTime(int lateTime) {
        this.lateTime = lateTime;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }
}
