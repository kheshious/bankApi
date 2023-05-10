package com.example.Bankdemo;

import java.util.List;

public class UserServiceImplementation  implements UserServiceInterface{
    private User_Repo userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
