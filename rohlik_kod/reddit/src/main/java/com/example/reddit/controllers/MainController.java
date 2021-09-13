package com.example.reddit.controllers;

import com.example.reddit.models.*;
import com.example.reddit.services.PostService;
import com.example.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private final PostService postService;
    private final UserService userService;

    @Autowired
    public MainController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/posts") // ---- OK ----------
    public ResponseEntity<List<PostDTO>> allPost(@RequestHeader(value = "Username", required = false) String userName) {

        List<PostDTO> postDTOList = new ArrayList<>();
        for (Post post : postService.findAll()) {

            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setUrl(post.getUrl());
            postDTO.setTimestamp(post.getTimestamp());
            postDTO.setScore(post.getScore());
            if (post.getOwner() != null) {
                postDTO.setOwnerName(post.getOwner().getUserName());
            } else {
                postDTO.setOwnerName(null);
            }

            postDTOList.add(postDTO);
        }

        return new ResponseEntity<>(postDTOList, HttpStatus.OK);
    }


    @PostMapping("/posts") //----OK -------
    public ResponseEntity<PostDTO> addPost(@RequestBody(required = false) Post post,
                                           @RequestHeader(value = "Username", required = false) String userName) {

        Post post1 = new Post(post.getTitle(), post.getUrl());

        post1.setOwner(userService.findUserByName(userName));

        postService.safePost(post1);

        PostDTO postDTO = new PostDTO();

        postDTO.setId(post1.getId());
        postDTO.setTitle(post1.getTitle());
        postDTO.setUrl(post1.getUrl());
        postDTO.setUrl(post1.getUrl());
        postDTO.setTimestamp(post1.getTimestamp());
        postDTO.setScore(post1.getScore());
        postDTO.setOwnerName(post1.getOwner().getUserName());


        return new ResponseEntity<>(postDTO, HttpStatus.OK);
    }

    @PutMapping(value = "/posts/{id}/upvote") // --- OK ----
    public ResponseEntity<PostDTO> upvote(@PathVariable Long id,
                                       @RequestHeader(value = "Username", required = false) String userName) {

        postService.upvotePost(postService.findById(id));
        PostDTO postDTO = new PostDTO();
        if (postService.findById(id).getOwner() != null) {
            postDTO.setId(id);
            postDTO.setTitle(postService.findById(id).getTitle());
            postDTO.setUrl(postService.findById(id).getUrl());
            postDTO.setTimestamp(postService.findById(id).getTimestamp());
            postDTO.setScore(postService.findById(id).getScore());
            postDTO.setOwnerName(postService.findById(id).getOwner().getUserName());
        } else {
            postDTO.setId(id);
            postDTO.setTitle(postService.findById(id).getTitle());
            postDTO.setUrl(postService.findById(id).getUrl());
            postDTO.setTimestamp(postService.findById(id).getTimestamp());
            postDTO.setScore(postService.findById(id).getScore());
            postDTO.setOwnerName(null);
        }

        return new ResponseEntity<>(postDTO, HttpStatus.OK);
    }

    @PutMapping(value = "/posts/{id}/downvote") // --- OK ----
    public ResponseEntity<PostDTO> downVote(@PathVariable Long id,
                                         @RequestHeader(value = "Username", required = false) String userName) {


        postService.downVotePost(postService.findById(id));
        PostDTO postDTO = new PostDTO();
        if (postService.findById(id).getOwner() != null) {
            postDTO.setId(id);
            postDTO.setTitle(postService.findById(id).getTitle());
            postDTO.setUrl(postService.findById(id).getUrl());
            postDTO.setTimestamp(postService.findById(id).getTimestamp());
            postDTO.setScore(postService.findById(id).getScore());
            postDTO.setOwnerName(postService.findById(id).getOwner().getUserName());
        } else {
            postDTO.setId(id);
            postDTO.setTitle(postService.findById(id).getTitle());
            postDTO.setUrl(postService.findById(id).getUrl());
            postDTO.setTimestamp(postService.findById(id).getTimestamp());
            postDTO.setScore(postService.findById(id).getScore());
            postDTO.setOwnerName(null);
        }

        return new ResponseEntity<>(postDTO, HttpStatus.OK);
    }

    //--------OPTIONAL ---------------------

    @PostMapping("/users") //-----------OK ---------------------
    public ResponseEntity<UserDTO> createUser(@RequestBody User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUserName());

        userService.safeUser(user);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PostMapping("/users/login") //----OK ------------------------
    public ResponseEntity<?> logInUser(@RequestBody UserLoginDTO user) { // I have only name and password

        UserLoginDTO user1 = new UserLoginDTO();
        user1.setPassword(user.getPassword());
        user1.setUsername(user.getUsername());

        User user2 = userService.findUserByName(user.getUsername());


        if (user2.getUserName().equals(user1.getUsername())
                && user2.getPassword().equals(user1.getPassword())) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUsername());

            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @DeleteMapping("/posts/{id}") //----OK -----
    private ResponseEntity<PostDTO> delete(@PathVariable(required = false) Long id,
                                           @RequestHeader(value = "Username", required = false) String userName) {

        PostDTO postDTO = new PostDTO();
        if (postService.findById(id).getOwner() != null) {
            if (postService.findById(id).getOwner().getUserName().equals(userName)) {
                if (postService.findById(id) != null) {
                    postDTO.setId(id);
                    postDTO.setTitle(postService.findById(id).getTitle());
                    postDTO.setUrl(postService.findById(id).getUrl());
                    postDTO.setTimestamp(postService.findById(id).getTimestamp());
                    postDTO.setScore(postService.findById(id).getScore());
                    if (postService.findById(id).getOwner() != null) {
                        postDTO.setOwnerName(postService.findById(id).getOwner().getUserName());
                    } else {
                        postDTO.setOwnerName(null);
                    }
                    postService.deletePost(id);
                }
            }

            return new ResponseEntity<>(postDTO, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/posts/{id}")
    private ResponseEntity<PostDTO> update(@PathVariable(required = false) Long id,
                                           @RequestHeader(value = "Username", required = false) String userName,
                                           @RequestBody PostUpdateDTO postUpdateDTO) {
        PostDTO postDTO = new PostDTO();

        if (postService.findById(id).getOwner() != null) {
            if (postService.findById(id).getOwner().getUserName().equals(userName)) {
                if (postService.findById(id) != null) {
                    postDTO.setId(id);
                    postDTO.setTitle(postUpdateDTO.getTitle());
                    postDTO.setUrl(postUpdateDTO.getUrl());
                    postDTO.setTimestamp(new Timestamp(System.currentTimeMillis()));
                    postDTO.setScore(postService.findById(id).getScore());
                    if (postService.findById(id).getOwner() != null) {
                        postDTO.setOwnerName(postService.findById(id).getOwner().getUserName());
                    } else {
                        postDTO.setOwnerName(null);
                    }
                }
                postService.findById(id).setTitle(postUpdateDTO.getTitle());
                postService.findById(id).setUrl(postUpdateDTO.getUrl());
            }

            return new ResponseEntity<>(postDTO, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
