package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>(List.of(
                new Post("1", new Date()),
                new Post("2", new Date()),
                new Post("3", new Date())));
        return posts;
    }
}
