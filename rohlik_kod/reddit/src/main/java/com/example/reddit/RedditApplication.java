package com.example.reddit;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import com.example.reddit.services.PostService;
import com.example.reddit.services.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public static void main(String[] args){
        SpringApplication.run(RedditApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        if(postRepository.findAll().isEmpty()){
            postRepository.save(new Post("Hello", "www.hello.com"));
            postRepository.save(new Post("Hi", "www.hi.com"));
            postRepository.save(new Post("Kuk", "www.kuk.com"));
        }
    }
}
