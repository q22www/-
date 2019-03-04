package com.example.books.entity;

/**
 * 分类表
 */
public class Classification {
    private Integer classificationId;//分类id
    private String classificationCategory;//类别

    public Classification() {
    }

    public Classification(String classificationCategory) {
        this.classificationCategory = classificationCategory;
    }

    public int getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(int classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationCategory() {
        return classificationCategory;
    }

    public void setClassificationCategory(String classificationCategory) {
        this.classificationCategory = classificationCategory;
    }
}
