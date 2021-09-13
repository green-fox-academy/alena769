package com.example.reddit.controllers;

import com.example.reddit.models.Post;
import com.example.reddit.models.PostDTO;
import com.example.reddit.models.UserDTO;
import com.example.reddit.repositories.PostRepository;
import com.example.reddit.services.PostService;
import com.example.reddit.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(MainController.class)
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostService postService;
    @MockBean
    private UserService userService;
    @MockBean
    private PostRepository postRepository;

    @Test
    void allPost_succesfull() throws Exception {
        List<Post> postList = new ArrayList<>();
        postList.add(new Post("Hello", "www.hello.com"));
        postList.add(new Post("Mello", "www.mello.com"));
        postList.add(new Post("Jello", "www.jello.com"));
        postList.add(new Post("Qello", "www.qello.com"));

        Mockito.when(postService.findAll()).thenReturn(postList);

        mockMvc.perform(get("/posts"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(4)))
//                .andExpect(content().json("" +
//                        "[{\"id\":null,\"title\":\"Hello\",\"url\":\"www.hello.com\",\"timestamp\":\"2021-05-07T14:35:40.879+00:00\",\"score\":0,\"owner\":null}," +
//                        "{\"id\":null,\"title\":\"Mello\",\"url\":\"www.mello.com\",\"timestamp\":\"2021-05-07T14:35:40.880+00:00\",\"score\":0,\"owner\":null}," +
//                        "{\"id\":null,\"title\":\"Jello\",\"url\":\"www.jello.com\",\"timestamp\":\"2021-05-07T14:35:40.880+00:00\",\"score\":0,\"owner\":null}," +
//                        "{\"id\":null,\"title\":\"Qello\",\"url\":\"www.qello.com\",\"timestamp\":\"2021-05-07T14:35:40.880+00:00\",\"score\":0,\"owner\":null}]"))
                .andExpect(jsonPath("$[0].id", nullValue()))
                .andExpect(jsonPath("$[0].title", is("Hello")))
//                .andExpect(jsonPath("$[0].url", is("www.hello.com")))
                .andDo(print());
    }

    @Test
    void addPost() {
    }

    @Test
    void upvote() {
    }

    @Test
    void downVote() {
    }

    @Test
    void createUser() {
    }

    @Test
    void logInUser() {
    }
}