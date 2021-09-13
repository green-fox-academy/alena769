package com.example.reddit.services;

import com.example.reddit.models.User;

import java.util.Optional;

public interface UserService {

    User findUserById(Long id);
    void safeUser(User user);
    User findUserByName(String name);


}
