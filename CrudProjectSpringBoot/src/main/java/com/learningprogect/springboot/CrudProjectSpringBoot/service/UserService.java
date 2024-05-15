package com.learningprogect.springboot.CrudProjectSpringBoot.service;


import com.learningprogect.springboot.CrudProjectSpringBoot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User showUserById(int id);

    public void deleteUserById(int id);
}
