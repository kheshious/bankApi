package com.example.Bankdemo;

import java.util.List;

public interface UserServiceInterface {
    User createUser(User user);
    List<User> getAllUsers();
}
