package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    private String text;
    private Integer likes;
    private Date creationDate;

    @Id
    @GeneratedValue
    private Long id;

    public Post() {}

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
