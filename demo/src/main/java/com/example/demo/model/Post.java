package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date date) {
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
        this.id = id;
    }

    public Integer getLikes() { return this.likes; }
    public String getText() { return this.text; }
    public Date getCreationDate() { return this.creationDate; }
    public Long getId() { return this.id; }

    public void setLikes(Integer likes) { this.likes = likes; }
}
