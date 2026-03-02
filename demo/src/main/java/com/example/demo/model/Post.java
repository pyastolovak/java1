package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date date) {
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

    public Integer getLikes() { return this.likes; }
    public String getText() { return this.text; }
    public Date getCreationDate() { return this.creationDate; }
}
