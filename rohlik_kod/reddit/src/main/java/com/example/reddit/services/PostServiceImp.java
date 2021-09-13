package com.example.reddit.services;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostServiceImp implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public void safePost(Post post) {

        postRepository.save(post);
    }

    @Override
    public void upvotePost(Post post) {

        post.setScore(post.getScore() + 1);

        postRepository.save(post);
    }

    @Override
    public void downVotePost(Post post) {

        post.setScore(post.getScore() - 1);

        postRepository.save(post);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.delete(findById(id));
    }
}
