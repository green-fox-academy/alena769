package com.example.reddit.services;

import com.example.reddit.models.User;
import com.example.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void safeUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserByName(String name) {

        return userRepository.findUserByUserName(name).orElse(null);
    }


}
