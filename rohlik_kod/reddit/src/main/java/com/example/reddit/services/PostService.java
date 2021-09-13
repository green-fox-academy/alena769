package com.example.reddit.services;

import com.example.reddit.models.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    void safePost(Post post);
    void upvotePost(Post post);
    void downVotePost(Post post);
    Post findById(Long id);
    void deletePost(Long id);
}
