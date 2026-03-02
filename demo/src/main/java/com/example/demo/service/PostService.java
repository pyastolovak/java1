package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>(List.of(
            new Post(0L, "1", new Date()),
            new Post(1L, "2", new Date()),
            new Post(2L, "3", new Date())));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(null, text, new Date()));
    }
}
