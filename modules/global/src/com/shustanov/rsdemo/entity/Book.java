package com.shustanov.rsdemo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "RS_BOOK")
@Entity(name = "rs$Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = 6323743611817286101L;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "AUTHOR")
    protected String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


