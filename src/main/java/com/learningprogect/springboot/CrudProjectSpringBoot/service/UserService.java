package com.learningprogect.springboot.CrudProjectSpringBoot.service;


import com.learningprogect.springboot.CrudProjectSpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(int id);

    void deleteUserById(int id);
}
